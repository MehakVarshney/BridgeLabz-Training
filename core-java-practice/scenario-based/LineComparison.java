import java.util.*;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the coordinate of line 1 : ");
        
        System.out.print("x1 : ");
        int x1 = sc.nextInt();
        System.out.print("y2 : ");
        int y1 = sc.nextInt();
        System.out.print("x2 : ");
        int x2 = sc.nextInt();
        System.out.print("y2 : ");
        int y2 = sc.nextInt();

        System.out.println("Enter the coordinate of line 2 : ");
        
        System.out.print("x3 : ");
        int x3 = sc.nextInt();
        System.out.print("y3 : ");
        int y3 = sc.nextInt();
        System.out.print("x4 : ");
        int x4 = sc.nextInt();
        System.out.print("y4 : ");
        int y4 = sc.nextInt();

        Double len1 = calculateLength(x1, y1, x2, y2);
        Double len2 = calculateLength(x3, y3, x4, y4);

        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);

        if (len1.equals(len2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        int compareResult = len1.compareTo(len2);

        if (compareResult == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } 
        else if (compareResult > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } 
        else {
            System.out.println("Line 1 is less than Line 2");
        }

        sc.close();

    }

    public static Double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
