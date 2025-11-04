package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CheckanyContaintz_31 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		boolean b = false;
		for (int i = 0; i < words.size(); i++) {
			String name = words.get(i);
			for (int j = 0; j < name.length(); j++) {
				char ch = name.charAt(j);
				if (ch == 'z' || ch == 'Z') {
					b = true;
					break;
				}

				
			}
		}
		System.out.println(b);
		System.out.println("using stream");

		boolean b1 = words.stream().anyMatch(x -> x.contains("z"));
		System.out.println(b1);

	}
}
