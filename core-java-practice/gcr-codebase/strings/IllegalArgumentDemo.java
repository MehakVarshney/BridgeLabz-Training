import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generate(String s) {
        s.substring(5, 2);
    }

    static void handle(String s) {
        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
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
