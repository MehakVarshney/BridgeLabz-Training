package staticMethodInterface;

interface SecurityUtils{
	static boolean checkPassword(String str) {
		return str.matches("[a-zA-Z0-9@]{8, }");
	}
}

public class PasswordStrengthValidator implements SecurityUtils {
	public static void main(String args[]) {
		String pass = "Harit@123";
		
		if(SecurityUtils.checkPassword(pass)) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
	}
}
