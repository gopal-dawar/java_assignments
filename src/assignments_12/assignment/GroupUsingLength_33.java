package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupUsingLength_33 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");
		List<String> four = new ArrayList<>();
		List<String> five = new ArrayList<>();
		List<String> six = new ArrayList<>();

		System.out.println("using loop");
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() == 4) {
				four.add(words.get(i));
			} else if (words.get(i).length() == 5) {
				five.add(words.get(i));
			} else if (words.get(i).length() == 6) {
				six.add(words.get(i));
			}
		}
		System.out.println("4 = " + four.toString());
		System.out.println("5 = " + five.toString());
		System.out.println("6 = " + six.toString());
 
		System.out.println("using stream");
		Map<Object, List<String>> g = words.stream().collect(Collectors.groupingBy(x -> {
			int le = x.length();
			if (le == 4 || le == 5 || le == 6) {
				return String.valueOf(le);
			} else {
				return "other";
			}
		}));

		System.out.println(g.toString());

	}
}
