import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in centimeters:");
        double heightIncm = scanner.nextDouble();
        double heightInfeet = heightIncm / 30.48; // 1 foot = 30.48 cm.
        double heightInInches = heightIncm / 2.54;// 1 inch = 2.54 cm.
        System.out.println("Your height in cm is "+heightIncm+ " and in feet is " + heightInfeet + " and in inches is: " + heightInInches);
        scanner.close();
    }
}
