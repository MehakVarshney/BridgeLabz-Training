import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] unique(String s) {
        char[] temp = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    ok = false;
                    break;
                }
            }
            if (ok) temp[k++] = c;
        }
        char[] r = new char[k];
        for (int i = 0; i < k; i++) r[i] = temp[i];
        return r;
    }

    static String[][] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;

        char[] u = unique(s);
        String[][] r = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            r[i][0] = String.valueOf(u[i]);
            r[i][1] = String.valueOf(f[u[i]]);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] r = freq(text);
        for (String[] row : r) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}
