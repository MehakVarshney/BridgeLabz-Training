
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                int mark;
                do {
                    if (j == 0) {
                        System.out.print("Physics: "); 
                    }else if (j == 1) {
                        System.out.print("Chemistry: "); 
                    }else {
                        System.out.print("Maths: ");
                    }
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Enter a positive value.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A'; 
            }else if (percentage[i] >= 70) {
                grade[i] = 'B'; 
            }else if (percentage[i] >= 60) {
                grade[i] = 'C'; 
            }else if (percentage[i] >= 50) {
                grade[i] = 'D'; 
            }else if (percentage[i] >= 40) {
                grade[i] = 'E'; 
            }else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0]
                    + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2]
                    + ", Percentage=" + percentage[i] + "%, Grade=" + grade[i]);
        }
        sc.close();
    }
}
