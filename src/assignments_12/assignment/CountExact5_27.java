package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CountExact5_27 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi", "melon", "apple",
				"mango");

		System.out.println("using loop");
		int count1 = 0;
		for (String n : words) {
			if (n.length() == 5) {
				count1++;
			}
		}
		System.out.println(count1 + " element which is length have 5");

		System.out.println("using stream");

		Long l = words.stream().filter(x -> x.length() == 5).count();

		System.out.println(l + " element which is length have 5");
	}
}
