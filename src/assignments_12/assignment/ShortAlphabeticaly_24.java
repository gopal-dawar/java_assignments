package assignments_12.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortAlphabeticaly_24 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("normaly	");
		Collections.sort(words);
		System.out.println(words);

		System.out.println("using stream");
		words.stream().sorted().forEach(System.out::println);
	}
}
