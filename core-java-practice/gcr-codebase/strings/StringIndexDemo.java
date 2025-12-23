import java.util.Scanner;

public class StringIndexDemo {

    static void generate(String s) {
        s.charAt(s.length());
    }

    static void handle(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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
