package exception;

import java.util.Scanner;

// Custom Checked Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionSystem {
    private static int balance = 1000;

    public static void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } 
        else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } 
        else {
            balance -= amount;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();

        try {
            withdraw(amount);
            System.out.println("Withdrawal successful, new balance: " + balance);
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
