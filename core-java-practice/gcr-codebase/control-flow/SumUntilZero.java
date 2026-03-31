import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int value;
        while (true) {
            value = sc.nextInt();
            if (value == 0)
                break;
            total += value;
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}
