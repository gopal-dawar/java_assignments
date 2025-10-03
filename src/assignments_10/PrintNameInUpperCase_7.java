package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintNameInUpperCase_7 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gopal", "Sairam", "Dawar", "ajay");
		for (String conv : names) {
			System.out.println(conv.toUpperCase());
		}
	}
}
