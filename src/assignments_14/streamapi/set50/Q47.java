package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q47 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic"));

		Set<String> uniSet = set.stream()
				.filter(x -> Character.toLowerCase(x.charAt(0)) == Character.toLowerCase(x.charAt(x.length() - 1)))
				.collect(Collectors.toSet());
		System.out.println(uniSet);
	}
}
