package assignments_11;

import java.util.function.BiFunction;

public class ReturnLengthOftwoString_18 {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> stringCheck = (x, y) -> (x + y).length();

		System.out.println(stringCheck.apply("Gopal", "Dawar"));
	}
}
