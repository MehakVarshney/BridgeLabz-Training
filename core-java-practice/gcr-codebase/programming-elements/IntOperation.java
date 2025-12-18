import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        // Compute integer operations (following operator precedence)
        int operation1 = a + b * c;      // Multiplication happens first
        int operation2 = a * b + c;      // Multiplication happens first
        int operation3 = c + a / b;      // Division happens first
        int operation4 = a % b + c;      // Modulus happens first
        
        // Print results
        System.out.println("The results of Int Operations are " + operation1 + ", " + operation2 + ", " + operation3 + ", and " + operation4);
        
        scanner.close();
    }
}