package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Q30 {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Apple", 10.23);
		map.put("Banana", 20.32);
		map.put("Cherry", 30.45);
		map.put("Orange", 40.90);
		map.put("Grapes", 50.12);
		map.put("Kiwi", 60.32);
		map.put("Mango", 70.01);
		map.put("Papaya", 8.12);

		double sum = map.entrySet().stream().map(Map.Entry::getValue).filter(x -> x % 1 != 0).reduce(0.0, Double::sum);
		Long count = map.entrySet().stream().map(Map.Entry::getValue).filter(x -> x % 1 != 0).count();

		System.out.println("Average : " + sum / count);
	}
}
