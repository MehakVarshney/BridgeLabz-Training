package exception;

import java.util.Scanner;

public class ExceptionPropagation {
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {

		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException();
		}
		return (amount * rate * years) / 100;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter amount : ");
			double amount = sc.nextDouble();
			System.out.println("enter rates : ");
			double rate = sc.nextDouble();
			System.out.println("Enter years : ");
			int years = sc.nextInt();

			double interest = calculateInterest(amount, rate, years);
		} catch (IllegalArgumentException e) {
			System.out.println("Amount and rate must me positive");
		}
	}
}
