import java.util.Random;
public class EmployeeWages {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");

            int wagePerHour = 20;
            int fullDayHours = 8;
            int dailyWage = wagePerHour * fullDayHours;
            System.out.println("Full day Employee Wage is " + dailyWage);

            int partTimeHours = 8;
            int partTimeWage = wagePerHour * partTimeHours;
            System.out.println("Part Time Employee Wage is " + partTimeWage);

            int workingDaysInMonth = 20;
            int monthlyWage = dailyWage * workingDaysInMonth;
            System.out.println("The Wage for a month is " + monthlyWage);

            int totalHoursLimit = 100;
            int maxDays = 20;
            int averageWorkingHours = totalHoursLimit / maxDays;
            int finalWage = (averageWorkingHours + workingDaysInMonth) * wagePerHour;
            System.out.println("Wages for the provided condition is " + finalWage);

        } else {
            System.out.println("Employee is Absent");
        }
    }
}
