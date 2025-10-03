package assignments_10;

import java.util.Arrays;
import java.util.List;

public class CountHowManyCharacterMore5Characters_4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Gopal", "Sairam", "Dawar", "Sakharam", "Mukesh");

		for (String n : list) {
			if (n.length() > 5) {
				System.out.println(n);
			}
		}
	}
}
