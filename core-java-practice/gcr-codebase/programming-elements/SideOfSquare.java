import java.util.Scanner;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        System.out.println("the length of the side is " + side + " whose perimeter is " + perimeter);
        scanner.close();
    }    
}
