import java.util.Scanner;

public class WordLengthTable {

    static int getLength(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }

    static String[] split(String s) {
        return s.split(" ");
    }

    static String[][] wordLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(getLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] table = wordLength(split(text));

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
