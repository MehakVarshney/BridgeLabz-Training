import java.util.Scanner;

public class PrintOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Even numbers between 1 and " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Odd numbers between 1 and " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}