package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class CheckSubstrin_19 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("India");
		names.add("USA");
		names.add("Canada");
		names.add("Germany");
		names.add("France");
		names.add("Beijing");
		names.add("Washington");
		names.add("Beijing");
		names.add("King");
		names.add("Shanghaiing");

		System.out.print("Names which is end with 'ing' : ");
		for (String n : names) {
			if (n.endsWith("ing")) {
				System.out.print(n + ", ");
			}
		}

	}
}
