package assignments_11;

import java.util.function.Function;
import java.util.function.Predicate;

public class CheckDivisible_14 {
	public static void main(String[] args) {
		Predicate<Integer> check3 = x -> x % 3 == 0;
		Predicate<Integer> check5 = x -> x % 5 == 0;
		Function<Integer, String> printMessage = x -> {
			String a = "";
			if (check3.test(x) && check5.test(x)) {
				a = "FizzBuzz";
			} else if (check5.test(x)) {
				a = "Buzz";
			} else if (check3.test(x)) {
				a = "Fizz";
			}
			return a;
		};

		System.out.println(printMessage.apply(5));
	}
}
