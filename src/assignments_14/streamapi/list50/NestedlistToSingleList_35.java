package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class NestedlistToSingleList_35 {
	public static void main(String[] args) {
		List<List<List<List<Integer>>>> list = Arrays.asList(
				Arrays.asList(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4)),
						Arrays.asList(Arrays.asList(5, 6), Arrays.asList(7, 8))),
				Arrays.asList(Arrays.asList(Arrays.asList(9, 10), Arrays.asList(11, 12))));

		List<Integer> slist = list.stream().flatMap(x -> x.stream().flatMap(y -> y.stream().flatMap(z -> z.stream())))
				.toList();
		System.out.println(slist);
	}
}
