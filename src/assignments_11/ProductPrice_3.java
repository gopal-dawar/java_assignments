package assignments_11;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProductPrice_3 {
	public static void main(String[] args) {
		Supplier<Double> take = () -> {
			return 2000.00;
		};
		Predicate<Double> check = x -> x >= 1000;

		if (check.test(take.get())) {
			Function<Double, Double> print = (x) -> {
				double amount = (x * 10) / 100;
				return amount;
			};
			
			System.out.println("Amount : " + print.apply(take.get()));
		}

	}
}
