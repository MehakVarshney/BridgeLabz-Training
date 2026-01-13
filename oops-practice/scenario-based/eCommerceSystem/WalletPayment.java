package eCommerceSystem;

public class WalletPayment implements Payment {
    private double walletBalance;

    public WalletPayment(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public void pay(double amount) throws PaymentFailedException {
        System.out.println(" Wallet payment of " + amount + " processing...");

        if (walletBalance < amount)
            throw new PaymentFailedException(" Wallet Payment Failed: Low Balance!");

        walletBalance -= amount;
        System.out.println(" Wallet Payment Success! Remaining Balance: " + walletBalance);
    }
}
