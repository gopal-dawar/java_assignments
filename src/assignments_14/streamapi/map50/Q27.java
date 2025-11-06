package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q27 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Cherry", 30);
		map.put("Orange", 40);
		map.put("Grapes", 50);
		map.put("Kiwi", 60);
		map.put("Mango", 70);
		map.put("Papaya", 80);

		Map<String, Integer> map2 = map.entrySet().stream()
				.collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue() * y.getValue()));
		System.out.println(map2);

	}
}
