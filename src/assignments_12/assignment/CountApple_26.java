package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CountApple_26 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");
		System.out.println("using loop");
		int count = 0;
		for (String n : words) {
			if (n.equals("apple")) {
				count++;
			}
		}
		System.out.println("'apple' appear " + count);
		System.out.println("using stream");

		
		Long l = words.stream().filter(x -> x.equals("apple")).count();
		System.out.println("'apple' appear " + l);
	}
}
