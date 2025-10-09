package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase_21 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		List<String> UpperCaseString = new ArrayList<String>();
		for (String n : words) {
			UpperCaseString.add(n.toUpperCase());
		}
		System.out.println(UpperCaseString.toString());

		System.out.println("using stream");

		List<String> newString = words.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(newString.toString());
	}
}
