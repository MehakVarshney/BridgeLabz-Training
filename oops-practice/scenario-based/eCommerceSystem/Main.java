package eCommerceSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Product Catalog
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1, "Laptop", 50000, 5));
        catalog.add(new Product(2, "Phone", 20000, 10));
        catalog.add(new Product(3, "Headphones", 2000, 20));

        System.out.println("📌 Product Catalog:");
        for (Product p : catalog) System.out.println(p);

        // Customer
        Customer customer = new Customer(101, "Mehak");

        // Cart
        List<Product> cart = new ArrayList<>();
        cart.add(catalog.get(1)); // Phone
        cart.add(catalog.get(2)); // Headphones

        //  Create Order
        Order order = new Order(5001, customer, cart);
        System.out.println("\n✅ Order Placed! Total: ₹" + order.getTotalAmount());

        //  Polymorphism (Try different payments)
        Payment payment = new WalletPayment(10000);
        // Payment payment = new UPIPayment();
        // Payment payment = new CardPayment();

        try {
            payment.pay(order.getTotalAmount());

            order.trackOrder();
            order.markShipped();
            order.trackOrder();
            order.markDelivered();
            order.trackOrder();

        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
            order.cancelOrder();
        }
    }
}
