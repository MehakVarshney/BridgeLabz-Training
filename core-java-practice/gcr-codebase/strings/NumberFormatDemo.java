import java.util.Scanner;

public class NumberFormatDemo {

    static void generate(String s) {
        Integer.parseInt(s);
    }

    static void handle(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generate(text);
        } catch (Exception e) {
            handle(text);
        }
    }
}
