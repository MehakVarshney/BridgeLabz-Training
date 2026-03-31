import java.util.*;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter due date (day): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int fine = (returnDate - dueDate) * 5;
                System.out.println("Book " + i + " Fine: ₹" + fine);
            } else {
                System.out.println("Book " + i + " No Fine");
            }
        }
    }
}
