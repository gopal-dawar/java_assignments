package assignments_14.streamapi.set50;

import java.util.Set;
import java.util.stream.Collectors;

public class Q32 {
	public static void main(String[] args) {
		Set<String> set1 = Set.of("Apple", "Mango", "Banana", "Orange");

		Set<String> set2 = Set.of("Grapes", "Banana", "Pineapple", "Mango");

		Set<String> aSet = set1.stream().filter(set2::contains).collect(Collectors.toSet());
		System.out.println(aSet);

	}
}
