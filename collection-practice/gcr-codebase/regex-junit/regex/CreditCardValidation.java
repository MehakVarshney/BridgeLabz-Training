public class CreditCardValidation {
    public static void main(String[] args) {
        String[] tests = {"4123456789012345", "5123456789012345", "6123456789012345"};

        for (String card : tests) {
            if (card.matches("^4\\d{15}$")) {
                System.out.println(card + " → Visa (Valid)");
            } else if (card.matches("^5\\d{15}$")) {
                System.out.println(card + " → MasterCard (Valid)");
            } else {
                System.out.println(card + " → Invalid");
            }
        }
    }
}
