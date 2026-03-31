import java.util.Scanner;

public class DeckOfCards {

    static String[] init() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[k++] = r + " of " + s;
            }
        }
        return deck;
    }

    static void shuffle(String[] d) {
        for (int i = 0; i < d.length; i++) {
            int r = i + (int)(Math.random() * (d.length - i));
            String t = d[i];
            d[i] = d[r];
            d[r] = t;
        }
    }

    static String[][] distribute(String[] d, int p, int n) {
        if (p * n > d.length) return null;
        String[][] r = new String[p][n];
        int k = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = d[k++];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = init();
        shuffle(deck);
        String[][] r = distribute(deck, players, cards);

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < cards; j++) {
                System.out.println(r[i][j]);
            }
        }
    }
}
