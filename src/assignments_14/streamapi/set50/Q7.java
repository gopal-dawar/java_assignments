package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q7 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(Arrays.asList("Papaya", "Cherry", null, null, "", "", "", "Banana",
				"Strawberry", "Apple", "Kiwi", "Orange", "Mango", "Pineapple", "Grapes", "madam", "racecar", "banana",
				"level", "apple", "noon", "civic"));

		set.stream().filter(x -> x != "").filter(x -> x != null).forEach(System.out::println);

	}
}
