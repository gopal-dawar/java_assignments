package assignments_14.streamapi.map50;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q24 {
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

		Entry<String, Integer> min = map.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get();
		System.out.println(min);

	}
}
