package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CountOdd_3 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		int count = 0;
		for (int n : number) {
			if (n % 2 != 0) {
				count++;
			}
		}
		System.out.println("Odd numbers count is : " + count);

		System.out.println("using stream");

		Long count1 = number.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Odd numbers count is : " + count1);
	}
}
