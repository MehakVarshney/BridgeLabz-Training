import java.util.Scanner;

public class ShortestLongest {

    static int getLength(String s) {
        int c = 0;
        for (char ch : s.toCharArray()) c++;
        return c;
    }

    static String[] split(String s) {
        return s.split(" ");
    }

    static String[] find(String[] words) {
        String min = words[0];
        String max = words[0];

        for (int i = 1; i < words.length; i++) {
            if (getLength(words[i]) < getLength(min)) min = words[i];
            if (getLength(words[i]) > getLength(max)) max = words[i];
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] result = find(split(text));

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
