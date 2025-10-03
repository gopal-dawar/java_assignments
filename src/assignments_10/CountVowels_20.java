package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class CountVowels_20 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Gopal");
		names.add("Sairam");
		names.add("Dawar");

		for (String nm : names) {
			System.out.println("Name : " + nm);
			System.out.print("Vowels : ");
			int count = 0;
			for(int i = 0; i < nm.length();i++) {
				char ch = Character.toLowerCase(nm.charAt(i));
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			System.out.println(count);
			
			
		}

	}
}
