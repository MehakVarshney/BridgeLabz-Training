
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            int p, c, m;

            while (true) {
                System.out.print("Physics: ");
                p = sc.nextInt();
                System.out.print("Chemistry: ");
                c = sc.nextInt();
                System.out.print("Maths: ");
                m = sc.nextInt();

                if (p >= 0 && c >= 0 && m >= 0)
                    break;
                else
                    System.out.println("Marks should be non-negative. Re-enter.");
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentage[i] = (p + c + m) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + ", Chemistry=" + chemistry[i] +
                    ", Maths=" + maths[i] + ", Percentage=" + percentage[i] + "%, Grade=" + grade[i]);
        }
        sc.close();
    }
}
