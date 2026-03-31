public class HexColorValidation {
    public static void main(String[] args) {
        String[] tests = {"#FFA500", "#ff4500", "#123"};

        for (String color : tests) {
            if (color.matches("^#[0-9A-Fa-f]{6}$")) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}
