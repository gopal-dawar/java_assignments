package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q43 {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>(Arrays.asList(3, 7, 2, 9));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(5, 1, 8));
		Set<Integer> s3 = new HashSet<>(Arrays.asList(6, 4, 0, 2, 9));

		Set<Set<Integer>> setOfSets = new HashSet<>();
		setOfSets.add(s1);
		setOfSets.add(s2);
		setOfSets.add(s3);

		setOfSets.stream().flatMap(x -> x.stream()).forEach(System.out::println);

	}
}
