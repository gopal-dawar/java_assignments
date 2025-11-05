package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q21 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "Banana", "level", "apple", "noon", "civic"));

		Map<String, Integer> pairs = set.stream().collect(Collectors.toMap(x -> x, y -> y.length()));
		System.out.println(pairs);
	}
}
