package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class DivisibleCheck_17 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		System.out.println("Normal Way");
		for (int n : list) {
			if (n % 7 == 0) {
				System.out.println(n);
			}
		}

		System.out.println("Using stream api");
		list.stream().filter(x -> x % 7 == 0).forEach(System.out::println);

	}
}
