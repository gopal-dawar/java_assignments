package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListStringToMapConvert_26 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");

		Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(name -> name, name -> name.length()));
		System.out.println(map);
	}
}
