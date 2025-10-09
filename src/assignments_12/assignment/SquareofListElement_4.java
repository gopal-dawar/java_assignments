package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class SquareofListElement_4 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

		System.out.println("using loop");
		for (int i = 0; i < numbers.size(); i++) {
			int sq = numbers.get(i) * numbers.get(i);
			System.out.print(sq);
			if (i < numbers.size() - 1) {
				System.out.print(",");
			}
		}
		
		System.out.println();

		System.out.println("using stream");
		numbers.stream().map(x -> x * x).forEach(x -> System.out.print(x + ","));

	}
}
