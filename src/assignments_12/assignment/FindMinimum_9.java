package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinimum_9 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 5);
		System.out.println("Using loop");
		int min = number.get(0);

		for (int i = 0; i < number.size(); i++) {
			if (number.get(i) < min) {
				min = number.get(i);
			}
		}
		System.out.println(" mininum is : " + min);

		System.out.println("using stream ");

		Optional<Integer> min1 = number.stream().min((x, y) -> x - y);
		System.out.println("Mininum is : " + min1.get());

	}
}
