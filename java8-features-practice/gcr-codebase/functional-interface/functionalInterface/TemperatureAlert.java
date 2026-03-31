package functionalInterface;

import java.util.function.Predicate;

public class TemperatureAlert {
	public static void checkTemperature(Double temp, Predicate<Double> predicate) {
		if (predicate.test(temp)) {
			System.out.println("High Alert Temperature " + temp);
		} else {
			System.out.println("Normal Temaperature " + temp);
		}
	}

	public static void main(String[] args) {

		Double threshold = 37.5;
		Predicate<Double> pr = new Predicate<>() {
			public boolean test(Double temp) {
				return temp > threshold;
			}
		};
		Double temp1 = 40.0;
		Double temp2 = 30.7;

		checkTemperature(temp1, pr);
		checkTemperature(temp2, pr);
	}
}
