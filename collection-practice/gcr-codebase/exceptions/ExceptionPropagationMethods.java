package exception;

import java.util.Scanner;

public class ExceptionPropagationMethods {
	public static int method1(int num1, int num2) {
		return num1/num2;
	}
	public static int method2(int num1, int num2) {
		return method1(num1 , num2);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		try {
			 int div = method2(num1, num2);
			 System.out.println("Result is : " + div);
		} catch(ArithmeticException e) {
			System.out.println("Handled exception in main");
		}
	}
}
