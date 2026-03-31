public class UsernameValidation {
    public static void main(String[] args) {
        String[] tests = {"user_123", "123user", "us"};

        for (String username : tests) {
            if (username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
