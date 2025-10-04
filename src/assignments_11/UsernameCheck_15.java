package assignments_11;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsernameCheck_15 {
	public static void main(String[] args) {
		Predicate<String> check = x -> x.startsWith("admin");
		
		
		Supplier<String> username = () -> "admin1233";
		
		if (check.test(username.get())) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Access Denied");
		}
		
	}
}
