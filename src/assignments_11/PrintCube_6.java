package assignments_11;

import java.util.function.Function;
import java.util.function.Supplier;

public class PrintCube_6 {
	public static void main(String[] args) {
		Function<Integer, Integer> check = x -> {
			return x * x * x;
		};

		Supplier<Integer> num = () -> 5;
		System.out.println(check.apply(num.get()));

	}
}
