public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is easy";
        String oldWord = "easy";
        String newWord = "powerful";

        sentence = sentence.replace(oldWord, newWord);
        System.out.println(sentence);
    }
}
