package eCommerceSystem;

import java.util.Random;

public class UPIPayment implements Payment {

    @Override
    public void pay(double amount) throws PaymentFailedException {
        System.out.println(" UPI payment of " + amount + " processing...");

        boolean success = new Random().nextBoolean();
        if (!success) throw new PaymentFailedException(" UPI Payment Failed!");

        System.out.println(" UPI Payment Success!");
    }
}
