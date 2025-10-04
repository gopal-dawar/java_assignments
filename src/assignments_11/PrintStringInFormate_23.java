package assignments_11;

import java.util.function.BiConsumer;

public class PrintStringInFormate_23 {
	public static void main(String[] args) {
		BiConsumer<String, Integer> check = (x, y) -> {
			System.out.print("Name: " + x + ",");
			System.out.print("Age: " + y);
		};

		check.accept("Gopal", 21);
	}
}
