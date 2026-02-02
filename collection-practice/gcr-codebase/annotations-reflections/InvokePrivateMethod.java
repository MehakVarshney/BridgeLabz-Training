import java.lang.reflect.Method;

public class InvokePrivateMethod {

	public static void main(String[] args) throws Exception {

		Calculator calculator = new Calculator();

		Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

		method.setAccessible(true); // bypass private access

		int result = (int) method.invoke(calculator, 5, 4);
		System.out.println("Result: " + result);
	}
}
