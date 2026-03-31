import java.util.Scanner;

public class BMICalculator {

    static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    static String[][] compute(double[][] hw) {
        String[][] data = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double h = hw[i][1] / 100.0;
            double w = hw[i][0];
            double bmi = w / (h * h);
            data[i][0] = String.valueOf(hw[i][1]);
            data[i][1] = String.valueOf(hw[i][0]);
            data[i][2] = String.format("%.2f", bmi);
            data[i][3] = bmiStatus(bmi);
        }
        return data;
    }

    static void display(String[][] t) {
        System.out.println("Height Weight BMI Status");
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i][0] + " " + t[i][1] + " " + t[i][2] + " " + t[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];
        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }
        display(compute(hw));
    }
}
