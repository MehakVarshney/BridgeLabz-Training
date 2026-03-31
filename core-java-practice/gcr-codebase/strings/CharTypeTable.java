import java.util.Scanner;

public class CharTypeTable {

    static String check(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyze(String s) {
        String[][] data = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            data[i][0] = String.valueOf(s.charAt(i));
            data[i][1] = check(s.charAt(i));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] table = analyze(text);

        System.out.println("Char\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }
}
