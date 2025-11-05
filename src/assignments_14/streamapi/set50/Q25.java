package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q25 {
	public static void main(String[] args) {
		Set<List<Integer>> setOfNumberLists = new HashSet<>();

		setOfNumberLists.add(Arrays.asList(10, 20, 30));
		setOfNumberLists.add(Arrays.asList(5, 15));
		setOfNumberLists.add(Arrays.asList(100, 200, 300, 400));

		List<Integer> list = setOfNumberLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(list);

	}
}
