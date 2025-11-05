package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q27 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(
				Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53));

		Map<Boolean, List<Integer>> a = set.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println(a);
	}
}
