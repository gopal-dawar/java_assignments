package assignments_11;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CheckEvenOdd_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		Predicate<Integer> check = x -> x % 2 != 0;

		Function<Integer, Integer> square = x -> {
			return x * x;
		};

		Consumer<Integer> printResult = x -> System.out.println("Square : " + x);

		if (check.test(num)) {
			printResult.accept(square.apply(num));
		} else {
			System.out.println("Even");
		}

		sc.close();
	}
}
