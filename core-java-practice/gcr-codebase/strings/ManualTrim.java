import java.util.Scanner;

public class ManualTrim {

    static int[] trimIndex(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static String substring(String s, int a, int b) {
        String r = "";
        for (int i = a; i < b; i++) r += s.charAt(i);
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String a = substring(text, idx[0], idx[1]);
        String b = text.trim();

        System.out.println(compare(a, b));
    }
}
