package assignments_11;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class TemperatureCheck_10 {
	public static void main(String[] args) {
		Predicate<Double> check = x -> x >= 37.5;
		
		Supplier<Double> value = () -> 232.32;
		
		if (check.test(value.get())) {
			System.out.println("High Temperatur");
		}else {
			System.out.println("Low Temperature");
		}
	}
}
