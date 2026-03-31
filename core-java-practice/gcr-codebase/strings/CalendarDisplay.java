import java.util.Scanner;

public class CalendarDisplay {

    static boolean leap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();

        String[] months = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (m == 2 && leap(y)) days[m] = 29;

        System.out.println(months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int d = 1; d <= days[m]; d++) {
            System.out.printf("%3d ", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
    }
}
