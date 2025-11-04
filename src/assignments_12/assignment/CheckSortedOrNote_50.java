package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckSortedOrNote_50 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		boolean b = list.stream().sorted().collect(Collectors.toList()).equals(list);
		System.out.println(b);

	}
}
