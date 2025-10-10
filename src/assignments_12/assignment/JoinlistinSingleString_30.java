package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JoinlistinSingleString_30 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		String single = words.get(0);
		for (int i = 1; i < words.size(); i++) {
			single = single + "," + words.get(i);
		}
		System.out.println(single);

		System.out.println("using stream");

		Optional<String> name = words.stream().reduce((x, y) -> x + "," + y);
		System.out.println(name.get());
		
	}
}
