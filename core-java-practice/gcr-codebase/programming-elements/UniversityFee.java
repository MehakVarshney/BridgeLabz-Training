public class UniversityFee {
    public static void main(String[] args) {
        double fee = 1250000.00;
        double discountPercent = 10.0;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The final university fee after a discount of " + discountPercent + "% is: INR " + finalFee);
    }
}
