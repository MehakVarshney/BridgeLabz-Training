public class CompareString {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";

        int minLen = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (result == 0)
            result = s1.length() - s2.length();

        if (result < 0)
            System.out.println("\"apple\" comes before \"banana\"");
        else
            System.out.println("\"banana\" comes before \"apple\"");
    }
}
