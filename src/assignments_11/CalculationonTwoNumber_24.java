package assignments_11;

import java.util.function.BiConsumer;

public class CalculationonTwoNumber_24 {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> sum = (x, y) -> {
			int sum1 = x + y;
			System.out.println("Sum : " + sum1);
		};

		BiConsumer<Integer, Integer> sub = (x, y) -> {
			int sub1 = x - y;
			System.out.println("Sub : " + sub1);
		};

		BiConsumer<Integer, Integer> mul = (x, y) -> {
			int mul1 = x * y;
			System.out.println("Mult : " + mul1);
		};

		BiConsumer<Integer, Integer> div = (x, y) -> {
			int div1 = x / y;
			System.out.println("Div : " + div1);
		};

		sum.accept(21, 1);
		sub.accept(10, 4);
		mul.accept(4, 2);
		div.accept(4, 2);

	}
}
