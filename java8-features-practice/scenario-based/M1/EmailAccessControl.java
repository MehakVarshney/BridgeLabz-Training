import java.util.*;
public class EmailAccessControl {
	public static boolean process(String s) {
		return s.matches("[a-z]{3,0}\\.[a-z]{3,}[0-9]{4,}@(sales|marketing|IT|product)\\.company\\.com");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n --> 0) {
			String s = sc.nextLine();
			if(process(s)) {
				System.out.println("Access Granted");
			}else {
				System.out.println("Access Denied");
			}
		}
	}
}
