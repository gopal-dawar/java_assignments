package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class Print4LengthElement_14 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();

		names.add("Gopal");
		names.add("Dawar");
		names.add("Sairam");
		names.add("abcd");
		names.add("xyzs");

		for (String name : names) {
			if (name.length() == 4) {
				System.out.println(name);
			}
		}

	}
}
