package assignments_11;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class CheckPassword_8 {
	public static void main(String[] args) {
		Predicate<String> check = x -> x.length() >= 8;

		Supplier<String> password = () -> {
			return "2dfs23";
		};

		if (check.test(password.get())) {
			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
			System.out.println("Enter more 8 then!");
		}
	}
}
