import java.util.Scanner;
public class ConvertKilometersToMiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enyer distance in kilometers");
        double km = scan.nextDouble();
        double miles = km * 1.6;
        System.out.println("the total miles is " + miles + "for the given" + km + " kilometers");
        scan.close();
    }
}
