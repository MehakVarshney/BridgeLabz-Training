import java.util.Scanner;

public class NestedFrequency {

    static String[] freq(String s) {
        char[] ch = s.toCharArray();
        int[] f = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            f[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    f[i]++;
                    ch[j] = '0';
                }
            }
        }

        int c = 0;
        for (int i = 0; i < ch.length; i++) if (ch[i] != '0') c++;

        String[] r = new String[c];
        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                r[k++] = ch[i] + " " + f[i];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] r = freq(text);
        for (String s : r) System.out.println(s);
    }
}
