package assignments_11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PrintSum_11 {
	public static void main(String[] args) {
		Supplier<Integer> num1 = () -> 2;
		Supplier<Integer> num2 = () -> 2;

		Function<Integer, Integer> doubleValue = x -> x + x;

		int sum = doubleValue.apply(num1.get()) + doubleValue.apply(num2.get());

		Consumer<Integer> print = x -> System.out.println("Sum : " + x);

		print.accept(sum);
	}
}
