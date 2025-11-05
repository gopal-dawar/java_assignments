package assignments_14.streamapi.set50;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q33 {
	public static void main(String[] args) {
		Set<String> set1 = Set.of("Apple", "Mango", "Banana", "Orange");

		Set<String> set2 = Set.of("Grapes", "Banana", "Pineapple", "Mango");

		Set<String> set = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());

		System.out.println(set);

	}
}
