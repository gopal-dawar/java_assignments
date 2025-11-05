package assignments_14.streamapi.set50;

import java.util.Set;
import java.util.stream.Collectors;

public class Q34 {
	public static void main(String[] args) {
		Set<String> set1 = Set.of("Apple", "Mango", "Banana", "Orange");
		Set<String> set2 = Set.of("Grapes", "Banana", "Pineapple", "Mango");

		Set<String> set = set1.stream().filter(x -> !set2.contains(x)).collect(Collectors.toSet());
		System.out.println(set);

	}
}
