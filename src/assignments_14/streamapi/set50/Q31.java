package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q31 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "le23vel", "apple", "n12oon", "c45ivic"));

		Set<String> set2 = set.stream().filter(x -> x.matches(".*\\d.*")).collect(Collectors.toSet());

		System.out.println(set2);
	}
}
