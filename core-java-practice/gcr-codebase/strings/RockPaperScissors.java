import java.util.Scanner;

public class RockPaperScissors {

    static String computer() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if (u.equals("rock") && c.equals("scissors")) return 1;
        if (u.equals("paper") && c.equals("rock")) return 1;
        if (u.equals("scissors") && c.equals("paper")) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int u = 0, c = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computer();
            int r = winner(user, comp);
            if (r == 1) u++;
            if (r == -1) c++;
        }

        System.out.println("Player\tComputer");
        System.out.println(u + "\t" + c);
        System.out.println((u * 100.0 / games) + "%\t" + (c * 100.0 / games) + "%");
    }
}
