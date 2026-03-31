import java.util.*;

public class SandeepFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pushUps = new int[7];
        int total = 0;
        int workoutDays = 0;

        System.out.println("Enter push-ups for 7 days (enter 0 for rest day):");

        for (int i = 0; i < 7; i++) {
            pushUps[i] = sc.nextInt();
        }

        for (int count : pushUps) {
            if (count == 0) {
                continue; 
            }
            total += count;
            workoutDays++;
        }

        double average = workoutDays > 0 ? (double) total / workoutDays : 0;

        System.out.println("Total Push-ups: " + total);
        System.out.println("Average Push-ups: " + average);
    }
}
