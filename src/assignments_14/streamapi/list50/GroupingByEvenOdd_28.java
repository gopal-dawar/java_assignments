package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEvenOdd_28 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");

		Map<Boolean, List<String>> map = list.stream().collect(Collectors.partitioningBy(x -> x.length() % 2 == 0));
		System.out.println(map);
	}
}
