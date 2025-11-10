package assignments_14.streamapi.map50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q39 {
	public static void main(String[] args) {
		Map<String, List<String>> depa = new HashMap<>();
		depa.put("HR", Arrays.asList("Alice", "Bob"));
		depa.put("IT", Arrays.asList("John", "Diana", "Steve"));
		depa.put("Sales", Arrays.asList("Raj", "Priya"));
		depa.put("Finance", Arrays.asList("Karan", "Maya", "Arjun"));
		depa.put("Marketing", Arrays.asList("Sara"));
		depa.put("Support", Arrays.asList("Tom", "Nina", "David"));

		depa.entrySet().stream().map(x -> x.getValue().stream()).collect(Collect);

	}
}
