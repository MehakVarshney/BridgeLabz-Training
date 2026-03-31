import java.util.Scanner;

public class LexicalTwist {

   
    public static boolean isInvalidWord(String str) {
      
        return str.contains(" ");
    }

 
    public static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String word1 = sc.nextLine();

        if (isInvalidWord(word1)) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String word2 = sc.nextLine();

        if (isInvalidWord(word2)) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        String reversedWord1 = new StringBuilder(word1).reverse().toString();

        if (reversedWord1.equalsIgnoreCase(word2)) {

            String result = reversedWord1.toLowerCase();

            String finalWord = "";
            for (int i = 0; i < result.length(); i++) {
                char ch = result.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    finalWord = finalWord + "@";
                } else {
                    finalWord = finalWord + ch;
                }
            }

            System.out.println(finalWord);

        } else {

            String combined = word1 + word2;

            combined = combined.toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if (isVowel(ch)) {
                    vowelCount++;
                } else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            if (vowelCount > consonantCount) {

                String printed = "";
                for (int i = 0; i < combined.length(); i++) {
                    char ch = combined.charAt(i);
                    if (isVowel(ch) && printed.indexOf(ch) == -1) {
                        printed = printed + ch;
                        if (printed.length() == 2) break;
                    }
                }
                System.out.println(printed);

            } else if (consonantCount > vowelCount) {

                String printed = "";
                for (int i = 0; i < combined.length(); i++) {
                    char ch = combined.charAt(i);
                    if (!isVowel(ch) && Character.isLetter(ch) && printed.indexOf(ch) == -1) {
                        printed = printed + ch;
                        if (printed.length() == 2) break;
                    }
                }
                System.out.println(printed);

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
}
