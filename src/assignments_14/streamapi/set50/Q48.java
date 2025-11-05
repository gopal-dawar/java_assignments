package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q48 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banan%a", "Stra@wberry", "Apple", "Ki*wi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic"));

		Set<String> sp = set.stream().filter(x -> x.matches(".*[^a-zA-Z0-9].*")).collect(Collectors.toSet());
		System.out.println(sp);
	}
}
