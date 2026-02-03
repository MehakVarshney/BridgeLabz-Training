package defaultMethodInterfaces;

interface PaymentProcessor{
	
	default void refund() {
		System.out.println("Refund is in pending..");
	}
}

class Shopify implements PaymentProcessor{
	public void pay() {
		System.out.println("Payment done");
	}
}
public class PaymentGateway {
	public static void main(String[] args) {
		Shopify customer = new Shopify();
		customer.pay();
		
		customer.refund();
	}
}
