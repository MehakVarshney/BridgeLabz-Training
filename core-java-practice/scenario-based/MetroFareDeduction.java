import java.util.Scanner;

public class MetroFareDeduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200;
        char choice;
        do {
            System.out.println("\nCurrent Balance: ₹" + balance);

            System.out.print("Enter distance travelled (in km): ");
            int distance = sc.nextInt();

            int fare = (distance <= 5) ? 20 : 40;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance! Journey not allowed.");
                break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' && balance > 0);

        System.out.println("\nThank you for using Delhi Metro 🚇");
        sc.close();
    }
}
