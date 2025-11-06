package assignments_14.streamapi.map50;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q33 {
	public static void main(String[] args) {
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("John", 45000);
		salaryMap.put("Emma", 55000);
		salaryMap.put("Michael", 60000);
		salaryMap.put("Sophia", 50000);
		salaryMap.put("David", 70000);
		salaryMap.put("Olivia", 65000);

		Map<Object, Object> map = salaryMap.entrySet().stream()
				.collect(Collectors.toMap(x -> x.getKey(), y ->y.getValue() +  y.getValue() * 0.1));
		System.out.println(map);
	}
}
