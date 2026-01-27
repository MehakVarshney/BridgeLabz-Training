package exception;

import java.util.Scanner;

public class MultipleCatchBlocks {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : " );
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			try {
				System.out.println("Index number : ");
				int index = sc.nextInt();
				int value = arr[index];
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Index");
			} catch(NullPointerException e) {
				System.out.println("Array is not initialized");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

