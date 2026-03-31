public class HarrayAge {
    public static void main(String[] args) {
        int birthYear = 2000; // Example birth year
        int currentYear = java.time.Year.now().getValue();//retrieving current year using java time package
        int age = currentYear - birthYear;
        System.out.println("Harry's age is: " + age);
    }
}