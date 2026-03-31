import java.util.Scanner;

public class CompareSumOfNatualNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1) {
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
