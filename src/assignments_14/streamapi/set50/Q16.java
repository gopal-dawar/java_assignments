package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q16 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(
				Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange", "Mango",
						"Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic"));

		int sum = set.stream().map(x -> x.length()).reduce(0, (x, y) -> x + y);
		System.out.println(sum);
	}
}
