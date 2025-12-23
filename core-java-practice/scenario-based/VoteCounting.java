import java.util.*;
public class VoteCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        while (true) {
            System.out.print("Enter age (Enter -1 to exit): ");
            int age = sc.nextInt();
            if (age == -1) {
                break;
            }
            if (age >= 18) {
                System.out.println("You are eligible to vote");
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                int vote = sc.nextInt();
                if (vote == 1) {
                    c1++;
                } 
                else if (vote == 2) {
                    c2++;
                } 
                else if (vote == 3) {
                    c3++;
                } 
                else {
                    System.out.println("Invalid vote");
                }

            } 
            else {
                System.out.println("You are not eligible to vote");
            }
        }
        System.out.println("Candidate 1 votes: " + c1);
        System.out.println("Candidate 2 votes: " + c2);
        System.out.println("Candidate 3 votes: " + c3);
        sc.close();
    }
}
