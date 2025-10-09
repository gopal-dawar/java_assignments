package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate_23 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");
		System.out.println("using loop");
		boolean[] b = new boolean[words.size()];
		List<String> newString = new ArrayList<>();
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if (words.get(i).equals(words.get(j))) {
					b[j] = true;
					break;
				}
			}
			if (b[i]) {
				newString.add(words.get(i));
			}
		}
		System.out.println(newString.toString() );

		System.out.println("using stream");

		List<String> newString1 = words.stream().distinct().collect(Collectors.toList());
		System.out.println(newString1.toString());
	}
}
