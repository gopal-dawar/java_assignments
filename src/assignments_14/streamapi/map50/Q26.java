package assignments_14.streamapi.map50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q26 {
	public static void main(String[] args) {
		Map<String, List<Integer>> map = new HashMap<>();

		map.put("Cherry", Arrays.asList(30, 35, 40));
		map.put("Banana", Arrays.asList(20, 22, 25));
		map.put("Papaya", Arrays.asList(80, 85, 90));
		map.put("Orange", Arrays.asList(40, 42, 45));
		map.put("Grapes", Arrays.asList(50, 55, 60));
		map.put("Kiwi", Arrays.asList(60, 62, 65));
		map.put("Mango", Arrays.asList(70, 75, 78));
		map.put("Apple", Arrays.asList(10, 12, 15));

		List<Integer> list = map.entrySet().stream().flatMap(x -> x.getValue().stream()).collect(Collectors.toList());
		System.out.println(list);

	}
}
