import java.util.Scanner;

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
