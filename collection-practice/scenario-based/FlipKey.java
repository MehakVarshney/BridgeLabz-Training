import java.util.Scanner;

public class FlipKey {

    public static String CleanseAndInvert(String input) {

        if (input == null || input.length() < 6) {
            return "";
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch)) {
                return "";
            }
        }

        input = input.toLowerCase();

        String temp = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;

            if (ascii % 2 != 0) {  
                temp = temp + ch;
            }
        }

        String reversed = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reversed = reversed + temp.charAt(i);
        }

        String result = "";
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);

            if (i % 2 == 0) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String input = sc.nextLine();

        String output = CleanseAndInvert(input);

        if (output.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + output);
        }

        sc.close();
    }
}
