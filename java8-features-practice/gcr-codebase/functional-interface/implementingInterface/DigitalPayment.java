package implementingInterface;

interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI (" + upiId + ")");
    }
}

class CreditCardPayment implements Payment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class DebitCardPayment implements Payment {

    private String cardNumber;

    public DebitCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card");
    }
}

public class DigitalPayment {

    public static void main(String[] args) {

        Payment payment = new UpiPayment("haritpatel@upi");
        payment.pay(1000);
    }
}
