package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectWhichContainte_34 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		List<String> newString = new ArrayList<>();

		for (String n : words) {
			if (n.contains("e")) {
				newString.add(n);
			}
		}
		System.out.println(newString);
		System.out.println("using stream");
		List<String> newString1 = words.stream().filter(x -> x.contains("e")).collect(Collectors.toList());
		System.out.println(newString1);
	}
}
