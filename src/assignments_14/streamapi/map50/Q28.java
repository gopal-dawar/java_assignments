package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Q28 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 10);
		map.put("Banana", 20);
		map.put("Cherry", 30);
		map.put("Orange", 43);
		map.put("Grapes", 50);
		map.put("Kiwi", 60);
		map.put("Mango", 70);
		map.put("Papaya", 80);

		Map<Boolean, List<Entry<String, Integer>>> map2 = map.entrySet().stream()
				.collect(Collectors.partitioningBy(x -> x.getValue() % 2 == 0));

		System.out.println(map2);
	}
}
