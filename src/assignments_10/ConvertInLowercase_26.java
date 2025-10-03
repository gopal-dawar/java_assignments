package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class ConvertInLowercase_26 {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("Gopal");
		s1.add("SAIRAM");
		s1.add("DAWAR");
		Set<String> s2 = new HashSet<>();

		for (String n : s1) {
			s2.add(n.toLowerCase());
		}
		
		for(String n: s2) {
			System.out.println(n);
		}

	}
}
