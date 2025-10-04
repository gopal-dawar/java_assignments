package assignments_11;

import java.util.function.BiPredicate;

public class CheckEqualString_20 {
	public static void main(String[] args) {
		BiPredicate<String, String> check = (x,y) -> x.equalsIgnoreCase(y);
		
		System.out.println(check.test("hello", "HELLO"));
		
		
	}
}
