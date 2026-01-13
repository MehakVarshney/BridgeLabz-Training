package eCommerceSystem;

import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> productList;
    private double totalAmount;
    private OrderStatus status;

    public Order(int orderId, Customer customer, List<Product> productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        this.totalAmount = calculateTotal();
        this.status = OrderStatus.PLACED;
    }

    private double calculateTotal() {
        double sum = 0;
        for (Product p : productList) {
            sum += p.getPrice();
        }
        return sum;
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<Product> getProductList() { return productList; }
    public double getTotalAmount() { return totalAmount; }
    public OrderStatus getStatus() { return status; }

    public void cancelOrder() {
        if (status == OrderStatus.DELIVERED) {
            System.out.println(" Cannot cancel. Order already delivered!");
        } else {
            status = OrderStatus.CANCELLED;
            System.out.println(" Order Cancelled: " + orderId);
        }
    }

    public void trackOrder() {
        System.out.println(" Order " + orderId + " Status: " + status);
    }

    public void markShipped() {
        if (status == OrderStatus.PLACED) status = OrderStatus.SHIPPED;
    }

    public void markDelivered() {
        if (status == OrderStatus.SHIPPED) status = OrderStatus.DELIVERED;
    }
}
