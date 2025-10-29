package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingFirstLeter_27 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");
		Map<Object, List<String>> li = list.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
		System.out.println(li);
	}
}
