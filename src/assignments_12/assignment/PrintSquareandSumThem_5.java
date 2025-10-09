package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSquareandSumThem_5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		int sum = 0;
		for (int n : numbers) {
			int sq = n * n;
			System.out.println(sq);
			sum = sum + sq;
		}
		System.out.println("sum is : " + sum);

		System.out.println("using stream");

		Optional<Integer> sum1 = numbers.stream().map(x -> {
			int sq = x * x;
			System.out.println(sq);
			return sq;
		}).reduce((x, y) -> x + y);

		System.out.println("sum is " + sum1.get());
	}
}
