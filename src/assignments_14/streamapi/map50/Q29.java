package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q29 {
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
		
		Map<Integer, List<String>> map2 = map.keySet().stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map2);
	}
}
