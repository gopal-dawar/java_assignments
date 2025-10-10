package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectLength_35 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");

		List<Integer> le = new ArrayList<>();

		for (String n : words) {
			le.add(n.length());
		}

		System.out.println(le);

		System.out.println("using stream");
		List<Integer> len = words.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println(len);
	}
}
