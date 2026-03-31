import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of Service: ");
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Enter again.\n");
                i--;   
                continue;
            }

            totalOldSalary += salary[i];
        }

        for (int i = 0; i < n; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;  
            } else {
                bonus[i] = salary[i] * 0.02;   
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n----- Zara Bonus Summary -----");
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

        sc.close();
    }
}
