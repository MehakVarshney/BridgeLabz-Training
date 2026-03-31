import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInvoke {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MathOperations obj = new MathOperations();

        Method method = MathOperations.class
                .getMethod(methodName, int.class, int.class);

        int result = (int) method.invoke(obj, a, b);

        System.out.println("Result: " + result);
    }
}
