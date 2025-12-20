
import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println("The number " + arr[i] + " is Positive and Even ");
                } else {
                    System.out.println("The number " + arr[i] + " is Positive and Odd ");
                }
            } else if (arr[i] < 0) {
                System.out.println("The number " + arr[i] + " is Negative");
            } else {
                System.out.println("The number " + arr[i] + " is Zero");
            }
        }

        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("The first element is greater");
        } else if (arr[0] < arr[arr.length - 1]) {
            System.out.println("The first element is smaller");
        } else {
            System.out.println("First and last Elements are equal");
        }

    }
}
