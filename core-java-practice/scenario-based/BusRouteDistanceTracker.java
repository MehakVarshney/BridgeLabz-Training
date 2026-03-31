import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopDistance = 2; 
        char choice = 'n';

        while (choice != 'y') {
            totalDistance += stopDistance;

            System.out.println("Bus reached next stop.");
            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("\nYou got off the bus.");
        System.out.println("Final distance travelled: " + totalDistance + " km");

        sc.close();
    }
}
