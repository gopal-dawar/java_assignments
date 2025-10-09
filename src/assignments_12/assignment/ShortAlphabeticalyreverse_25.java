package assignments_12.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShortAlphabeticalyreverse_25 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		Collections.sort(words);

		for (int i = words.size()-1;i>= 0;i--) {
			System.out.println(words.get(i));
		}
		System.out.println("using stream");
		words.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
