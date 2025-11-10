package assignments_14.streamapi.map50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q38 {
	public static void main(String[] args) {
		Map<String, List<Integer>> fruits = new HashMap<>();
		fruits.put("Apple", Arrays.asList(10, 20, 30));
		fruits.put("Mango", Arrays.asList(15, 25));
		fruits.put("Banana", Arrays.asList(5, 10, 15, 20));

		int sum = fruits.entrySet().stream().flatMap(x -> x.getValue().stream()).reduce(0, (x, y) -> x + y);
		System.out.println(sum);

	}
}
