package M1;
import java.util.*;
public class KeyGeneration {
	public static String process(String s) {
		if(s.isEmpty()) {
			return "Invalid Input (empty string)";
		}
		if(s.length() < 6) {
			return "Invalid Input (length < 6)";
		}
		if(s.contains(" ")) {
			return "Invalid Input (contains space)";
		}
		if(s.matches(".*[0-9].*")) {
			return "Invalid Input (contains digits)";
		}
		if(!s.matches("[A-Za-z]+")) {
			return "Invalid Input (contains special character)";
		}
		
			String l = s.toLowerCase();
			String rem = "";
			for(int i = 0; i < l.length(); i++) {
				char ch = l.charAt(i);
				int ascii = (int)i;
				if(ascii % 2 != 0) {
					rem = rem + ch;
				}
			}
			String rev = "";
			for(int i = rem.length()-1; i >= 0; i--) {
				rev = rev + rem.charAt(i);
			}
			String cnv = "";
			for(int i = 0; i < rev.length(); i++) {
				char ch = rev.charAt(i);
				if(i % 2 == 0) {
					cnv = cnv + Character.toUpperCase(ch);
				}
				else {
					cnv = cnv + ch;
				}
			}
			return "The generated key is - " + cnv;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n --> 0) {
			String s = sc.nextLine();
			System.out.println(process(s));
		}
	}
}
