package assignments_14.streamapi.map50;

import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q34 {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "John");
		employeeMap.put(102, "Emma");
		employeeMap.put(103, "Michael");
		employeeMap.put(104, "Sophia");
		employeeMap.put(105, "David");
		employeeMap.put(11, "David");
		employeeMap.put(106, "Olivia");

		employeeMap.entrySet().stream().filter(x -> {
			int key = x.getKey();
			boolean b = true;
			if (key <= 1) {
				b = false;
			} else {
				for (int i = 2; i < key; i++) {
					if (key % i == 0) {
						b = false;
						break;
					}
				}
			}
			return b;
		}
		).forEach(x -> System.out.println(x));

	}
}
