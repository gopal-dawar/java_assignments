package assignments_11;

import java.util.function.BiFunction;

public class RepeatString_17 {
	public static void main(String[] args) {
		BiFunction<String, Integer, String> repeate = (x, y) -> {
			String name = x;
			for (int i = 1; i < y; i++) {
				name += x;
			}
			return name;
		};

		System.out.println(repeate.apply("Hi", 5));
	}
}
