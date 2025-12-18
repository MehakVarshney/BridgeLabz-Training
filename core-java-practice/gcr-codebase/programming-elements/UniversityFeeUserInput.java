import java.util.Scanner;
public class UniversityFeeUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the University Fee :");
        double fee = scanner.nextDouble();
        System.out.println("Enter the discount given by University :");
        double discountPercent = scanner.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalfee = fee-discount;
        System.out.println("The final fee after the given university discount is: "+ finalfee);
        scanner.close();
    }
}
