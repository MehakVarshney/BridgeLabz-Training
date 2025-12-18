import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter double a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter double b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter double c: ");
        double c = scanner.nextDouble();
        
        double result1 = a + b * c;     // b * c is evaluated first
        double result2 = a * b + c;     // a * b is evaluated first
        double result3 = c + a / b;     // a / b is evaluated first
        double result4 = a % b + c;     // a % b is evaluated first

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        
        scanner.close();
    }
}