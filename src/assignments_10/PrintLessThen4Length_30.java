package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintLessThen4Length_30 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Gopal", "Sairam", "Dawar", "abcd", "abc", "xyz");

		System.out.print("Names less then 4 length : ");
		for (String nm : names) {
			if (nm.length() <= 4) {
				System.out.print(nm + " ");
			}
		}
	}
}
