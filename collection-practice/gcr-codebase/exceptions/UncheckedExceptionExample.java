package exception;

import java.util.*;

public class UncheckedExceptionExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int div = a / b;
            System.out.println("Result is : " + div);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter numeric values only.");

        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    }
}
