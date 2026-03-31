import java.util.Scanner;

public class VowelConsonantCount {

    static int check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return 1;
            return 2;
        }
        return 0;
    }

    static int[] count(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            int r = check(s.charAt(i));
            if (r == 1) v++;
            if (r == 2) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] res = count(text);

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
