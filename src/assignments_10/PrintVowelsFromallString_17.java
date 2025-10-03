package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class PrintVowelsFromallString_17 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();

		names.add("Gopal");
		names.add("Sairam");
		names.add("Dawar");

		for (String a1 : names) {
			System.out.println("Name : " + a1);
			System.out.print("Vowels : ");
			
			for (int i = 0; i < a1.length(); i++) {
				char ch = a1.charAt(i);
				if (ch == 'a' || ch == 'o' || ch == 'e' || ch == 'i' || ch == 'u') {
					System.out.print(ch + " ");
				}
			}
			
			System.out.println();

		}

	}
}
