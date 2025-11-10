package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;

public class Q36 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Cherry", 30);
		map.put("Banana", 20);
		map.put("Papaya", 80);
		map.put("Orange", 40);
		map.put("Grapes", 50);
		map.put("Kiwi", 60);
		map.put("Mango", 70);
		map.put("Apple", 10);

		String sub = "App";

		map.entrySet().stream().filter(x -> x.getKey().contains(sub)).forEach(System.out::println);
	}
}
