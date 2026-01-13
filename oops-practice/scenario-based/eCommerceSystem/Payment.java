package eCommerceSystem;

public interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
