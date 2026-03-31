package functionalInterface;

import java.util.function.Function;

public class StringLengthChecker {

	public static void checkLength(String str, int limit, Function<String, Integer> fun) {
		if (fun.apply(str) > limit) {
			System.out.println("Message excceds limit");
		} else {
			System.out.println("Message doesn't exceed limit");
		}
	}

	public static void main(String[] args) {

		int limit = 26;
		String str = "HaritPatel";

		Function<String, Integer> func = new Function<>() {
			public Integer apply(String str) {
				return str.length();
			}
		};

		checkLength(str, limit, func);
	}
}
