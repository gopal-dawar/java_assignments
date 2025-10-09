package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerCase_22 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("APPLE", "BANANA", "MANGO", "ORANGE", "GRAPE", "KIWI", "MELON", "APPLE",
				"MANGO");

		System.out.println("using loop");
		List<String> newString1 = new ArrayList<>();

		for (String n : words) {
			newString1.add(n.toLowerCase());
		}
		System.out.println(newString1.toString());

		System.out.println("using stream");
		List<String> newString2 = words.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
		System.out.println(newString2.toString());
	}	
}
