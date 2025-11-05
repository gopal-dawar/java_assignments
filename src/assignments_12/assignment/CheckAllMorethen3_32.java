package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CheckAllMorethen3_32 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		boolean b = false; 
		for (String n : words) {
			if (n.length() < 3) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println(b);
		} else {
			System.out.println(b);
		}
		System.out.println("using stream");

		boolean b1 = words.stream().anyMatch(x -> x.length() < 3);
		System.out.println(b1);
	}
}
