public class RemoveCharacter {
    public static void main(String[] args) {
        String s = "Hello World";
        char remove = 'l';
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != remove)
                result += s.charAt(i);
        }

        System.out.println("Modified String: " + result);
    }
}
