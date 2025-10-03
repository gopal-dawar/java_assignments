package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class CheckEndwitha_15 {
	public static void main(String[] args) {
		Set<String> countryName = new HashSet<>();

		countryName.add("India");
		countryName.add("USA");
		countryName.add("Canada");
		countryName.add("Australia");
		countryName.add("Germany");
		countryName.add("France");
		countryName.add("Italy");
		countryName.add("Japan");
		countryName.add("Brazil");
		countryName.add("South Africa");

		for(String n : countryName) {
			if (n.endsWith("a")) {
				System.out.println(n);
			}
		}
	}
}
