package eCommerceSystem;

import java.util.Random;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) throws PaymentFailedException {
        System.out.println(" Card payment of " + amount + " processing...");

        boolean success = new Random().nextBoolean();
        if (!success) throw new PaymentFailedException(" Card Payment Failed!");

        System.out.println(" Card Payment Success!");
    }
}
