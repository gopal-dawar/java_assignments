package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q29 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic"));

		Map<Character, String> map = set.stream().collect(Collectors.toMap(x -> x.charAt(0), y -> y, (a, y) -> a));
		System.out.println(map);

	}
}
