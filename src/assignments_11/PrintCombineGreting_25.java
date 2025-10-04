package assignments_11;

import java.util.function.BiConsumer;

public class PrintCombineGreting_25 {
	public static void main(String[] args) {
		BiConsumer<String, String> greating = (x, y) -> {
			System.out.println(x + " " + y);
		};

		greating.accept("Hi", "Gopal");
	}
}
