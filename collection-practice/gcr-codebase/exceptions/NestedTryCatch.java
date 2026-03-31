package exception;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the divisor : ");
		int divisor = sc.nextInt();
		System.out.println("Index of accessing element : ");
		int index = sc.nextInt();
		try {
			int value = arr[index];
			try {
				int div = value / divisor;
				System.out.println("Element at an index : " + value);
				System.out.println("Divide that element by the divisor : " + div);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is invalid");
		}
	}
}
