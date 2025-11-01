package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedArrayinSinglelist_44 {
	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(3, 7, 2, 9), Arrays.asList(5, 1, 8),
				Arrays.asList(6, 4, 0, 2, 9));
		List<Integer> nl = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(nl.toString());
	}
}
