import java.util.Scanner;

public class UniqueCharacters {

    static int len(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }

    static char[] unique(String s) {
        int n = len(s);
        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) temp[k++] = c;
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] r = unique(text);
        for (char c : r) System.out.print(c + " ");
    }
}
