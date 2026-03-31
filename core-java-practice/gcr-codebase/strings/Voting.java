public class Voting {

    static int[] ages(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 90);
        }
        return a;
    }

    static String[][] check(int[] age) {
        String[][] data = new String[age.length][2];
        for (int i = 0; i < age.length; i++) {
            data[i][0] = String.valueOf(age[i]);
            data[i][1] = String.valueOf(age[i] >= 18);
        }
        return data;
    }

    static void display(String[][] t) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i][0] + "\t" + t[i][1]);
        }
    }

    public static void main(String[] args) {
        display(check(ages(10)));
    }
}
