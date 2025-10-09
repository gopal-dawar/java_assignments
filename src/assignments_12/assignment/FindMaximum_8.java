package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximum_8 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		int max = number.get(0);
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) > max) {
				max = number.get(i);
			}
		}
		System.out.println("Maximum is : " + max);

		System.out.println("using stream");

		Optional<Integer> max1 =  number.stream().max((x, y) -> x - y);
		System.out.println("Maximum is : " + max1.get());
	}
}
