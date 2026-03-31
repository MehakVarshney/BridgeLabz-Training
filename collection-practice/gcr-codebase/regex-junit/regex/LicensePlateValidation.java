public class LicensePlateValidation {
    public static void main(String[] args) {
        String[] tests = {"AB1234", "A12345", "XY5678"};

        for (String plate : tests) {
            if (plate.matches("^[A-Z]{2}[0-9]{4}$")) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
