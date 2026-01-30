public class SSNValidation {
    public static void main(String[] args) {
        String[] tests = {"123-45-6789", "123456789"};

        for (String ssn : tests) {
            if (ssn.matches("^\\d{3}-\\d{2}-\\d{4}$")) {
                System.out.println(ssn + " → Valid");
            } else {
                System.out.println(ssn + " → Invalid");
            }
        }
    }
}
