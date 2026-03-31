import java.util.Scanner;

public class SplitCompare {

    static int getLength(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }

    static String[] manualSplit(String s) {
        int len = getLength(s);
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') count++;
        }

        int[] spaces = new int[count + 1];
        spaces[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                spaces[idx++] = i;
            }
        }
        spaces[idx] = len;

        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            String w = "";
            for (int j = spaces[i] + 1; j < spaces[i + 1]; j++) {
                w = w + s.charAt(j);
            }
            words[i] = w;
        }
        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] a = manualSplit(text);
        String[] b = text.split(" ");

        System.out.println(compare(a, b));
    }
}

