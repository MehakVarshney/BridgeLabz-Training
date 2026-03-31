import java.util.Scanner;
public class DivisibleByFive{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 5 == 0)
			System.out.print("True");
		else 
			System.out.print("False");
	}
}