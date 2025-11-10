package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q37 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Cherry", "Thirty");
		map.put("Banana", "Twenty");
		map.put("Papaya", "Eighty");
		map.put("Orange", "Forty");
		map.put("Grapes", "Fifty");
		map.put("Kiwi", "Sixty");
		map.put("Mango", "Seventy");
		map.put("Apple", "Ten");

		Map<String, String> newmap = map.entrySet().stream()
				.collect(Collectors.toMap(x -> x.getKey().toUpperCase(), y -> y.getValue().toLowerCase()));

		System.out.println(newmap);
	}
}
