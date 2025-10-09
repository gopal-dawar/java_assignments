package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class PrintallWord_18 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		for (String n : words) {
			System.out.println(n);
		}

		System.out.println("using stream");
		words.stream().forEach(System.out::println);
		
	}
}
