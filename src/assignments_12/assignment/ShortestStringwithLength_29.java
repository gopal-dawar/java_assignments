package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestStringwithLength_29 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		int le = words.get(0).length();
		List<String> l = new ArrayList<>();
		l.add(words.get(0));

		for (int i = 1; i < words.size(); i++) {
			if (le > words.get(i).length()) {
				le = words.get(i).length();
				l.clear();
				l.add(words.get(i));
			} else if (le == words.get(i).length()) {
				l.add(words.get(i));
			}
		}
		System.out.println(l.toString() + " is sorted string in list and length is " + le);

		System.out.println("using stream");
		int lengthofstring = words.stream().mapToInt(x -> x.length()).min().orElse(0);
		List<String> list = words.stream().filter(x -> x.length() == lengthofstring).collect(Collectors.toList());

		System.out.println(list + " is sorted string in list and length is " + le);
	}
}
