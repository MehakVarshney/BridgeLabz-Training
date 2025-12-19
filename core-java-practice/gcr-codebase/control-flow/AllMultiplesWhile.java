import java.util.Scanner;

public class AllMultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num <= 0 || num >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            sc.close();
            return;
        }
        
        int counter = num - 1;
        
        System.out.println("Multiples of " + num + " below 100:");
        while (counter > 1) {
            if (num % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }
        sc.close();
    }
}