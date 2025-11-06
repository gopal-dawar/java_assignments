package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q17 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Cherry", 31);
		map.put("Orange", 40);
		map.put("Grapes", 7);
		map.put("Kiwi", 60);
		map.put("Mango", 70);
		map.put("Papaya", 80);

		Map<Object, Object> s = map.entrySet().stream().filter(x -> x.getValue() % 2 == 0)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(s);

	}
}
