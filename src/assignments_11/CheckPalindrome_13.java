package assignments_11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class CheckPalindrome_13 {
	public static void main(String[] args) {
		Function<String, String> check = x -> {
			String reverse = "";
			for (int i = x.length() - 1; i >= 0; i--) {
				char ch = x.charAt(i);
				reverse = reverse + ch;
			}
			return reverse;
		};

		Supplier<String> name = () -> "namann";
		Consumer<String> print = x -> System.out.println(x + " is palindrome");
		
		if (name.get().equals(check.apply(name.get()))) {
			print.accept(name.get());
		} else {
			System.out.println(name.get() + " is not palindrome");
		}
		

	}
}
