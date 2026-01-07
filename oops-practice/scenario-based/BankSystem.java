import java.util.*;

// -------- Custom Exception --------
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// (Abstraction)
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();
}

// -------- Abstract Account Class --------
abstract class Account implements BankService {
    protected String accountNumber;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // synchronized for multithreading safety
    public synchronized void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

//Current Account
class CurrentAccount extends Account {

    CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}

// -------- Multithreading for Fund Transfer --------
class TransferThread extends Thread {
    private Account from;
    private Account to;
    private double amount;

    TransferThread(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run() {
        synchronized (from) {
            try {
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred " + amount);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// -------- Main Class --------
public class BankSystem {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SAV101", 5000);
        Account current = new CurrentAccount("CUR202", 3000);

        savings.deposit(1000);
        savings.checkBalance();

        try {
            savings.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Multithreaded Transfer
        TransferThread t1 = new TransferThread(savings, current, 1000);
        TransferThread t2 = new TransferThread(savings, current, 500);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("\nSavings Account:");
        savings.checkBalance();
        savings.showTransactions();
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println("\nCurrent Account:");
        current.checkBalance();
        current.showTransactions();
        System.out.println("Interest: " + current.calculateInterest());
    }
}