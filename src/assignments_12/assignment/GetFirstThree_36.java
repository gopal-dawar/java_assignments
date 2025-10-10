package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class GetFirstThree_36 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		for (int i = 0; i < 3; i++) {
			System.out.print(words.get(i) + " ");
		}

		System.out.println();
		System.out.println("using stream");
		words.stream().limit(3).forEach(x -> System.out.print(x + " "));
	}
}
