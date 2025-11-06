package assignments_14.streamapi.map50;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q32 {
	public static void main(String[] args) {
		List<Map.Entry<String, Integer>> map = new ArrayList<>();
		map.add(new AbstractMap.SimpleEntry<>("Apple", 10));
		map.add(new AbstractMap.SimpleEntry<>("Banana", 20));
		map.add(new AbstractMap.SimpleEntry<>("Cherry", 30));
		map.add(new AbstractMap.SimpleEntry<>("Orange", 40));
		map.add(new AbstractMap.SimpleEntry<>("Grapes", 50));
		map.add(new AbstractMap.SimpleEntry<>("Kiwi", 60));

		Map<String, Integer> map2 = map.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map2);
	}
}
