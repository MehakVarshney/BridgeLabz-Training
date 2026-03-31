package M1;
import java.util.*;

public class LogValidator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0) {
			String log = sc.nextLine();
			System.out.println(validateLog(log) ? "VALID LOG" : "INVALID LOG");			
		}

	}
	public static boolean validateLog(String log) {
		String[] arr = log.split("\\|");
		if(arr.length != 5) {
			return false;
		}
		
		return validTXN(arr[0]) && validDate(arr[1]) && validAmt(arr[2]) && validCurr(arr[3]) && validStatus(arr[4]);
	}
	
	public static boolean validTXN(String s) {
		return s.matches("^TXN-(?!.*(\\d)\\1{3})[1-9][0-9]{5}");
	}
	
	public static boolean validDate(String d) {
		if(!d.matches("\\d{4}-\\d{2}-\\d{2}")) return false;
		String[] arr = d.split("-");
		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		if(y < 2009 || y > 2099) {
			return false;
		}
		if(m < 1 || m > 12) {
			return false;
		}
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(m == 2 && isLeap(y)) days[1] = 29;
		return day >= 1 && day <= days[m - 1];
		
	}
	static boolean isLeap(int y) {
		return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
	}
	
	static boolean validAmt(String s) {
		double val;
		try {
			val = Double.parseDouble(s);
		}catch(Exception e){
			return false;
		}
		if(val <= 0 || val >= 999999.99) return false;
		
		if(s.startsWith("0")) {
			return s.matches("0\\.\\d+");
		}
		
		return s.matches("[1-9]\\d*\\.\\d{2}");
	}
	
	static boolean validCurr(String s) {
		return s.equals("USD") || s.equals("INR");
	}
	
	static boolean validStatus(String s) {
		return s.equals("SUCCESS") || s.equals("FAILED") || s.equals("PENDING");
	}

}
