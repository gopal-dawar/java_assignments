package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate_6 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(5, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		boolean[] b = new boolean[number.size()];
		for (int i = 0; i < number.size(); i++) {
			if (b[i]) {
				continue;
			}
			for (int j = 0; j < number.size(); j++) {
				if (number.get(i) == number.get(j)) {
					b[j] = true;
					break;
				}
			}
			if (b[i]) {
				System.out.println(number.get(i));
			}
		}

		System.out.println("using stream");
		number.stream().distinct().forEach(System.out::println);
		

	}
}
