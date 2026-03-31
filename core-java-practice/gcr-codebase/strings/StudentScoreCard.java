public class StudentScoreCard {

    static int[][] scores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = 10 + (int)(Math.random() * 90);
            s[i][1] = 10 + (int)(Math.random() * 90);
            s[i][2] = 10 + (int)(Math.random() * 90);
        }
        return s;
    }

    static double[][] calc(int[][] s) {
        double[][] r = new double[s.length][3];
        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double avg = total / 3.0;
            double per = avg;
            r[i][0] = total;
            r[i][1] = Math.round(avg * 100.0) / 100.0;
            r[i][2] = Math.round(per * 100.0) / 100.0;
        }
        return r;
    }

    static String grade(double p) {
        if (p >= 90) return "A";
        if (p >= 75) return "B";
        if (p >= 60) return "C";
        if (p >= 40) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] s = scores(n);
        double[][] r = calc(s);

        System.out.println("P C M Total Avg % Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(
                s[i][0] + " " + s[i][1] + " " + s[i][2] + " " +
                (int)r[i][0] + " " + r[i][1] + " " + r[i][2] + " " +
                grade(r[i][2])
            );
        }
    }
}
