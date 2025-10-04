package assignments_11;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Sum_16 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;

		Consumer<Integer> printSum = x -> System.out.println("Sum : " + x);

		printSum.accept(sum.apply(12, 21));
	}
}
