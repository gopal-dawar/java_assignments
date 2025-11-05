package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q12 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(
				Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, -1, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53));
		boolean b = set.stream().allMatch(x -> x > 0);
		System.out.println(b);

	}
}
