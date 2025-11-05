package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q46 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic"));

		set.stream().map(x -> x.toLowerCase()).distinct().forEach(System.out::println);
	}
}
