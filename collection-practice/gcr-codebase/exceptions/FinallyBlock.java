package exception;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		try {
			int div = num1/num2;
			System.out.println("Result : " + div);
		} catch(ArithmeticException e) {
			System.out.println("Divide by zero invalid");
		} finally {
			System.out.println("Operation completed");
		}
	}
}
