package assignments_10;

import java.util.Arrays;
import java.util.List;

public class CountDivisible3and5_8 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(15, 7, 8, 2, 3, 1);

		int count = 0;
		for (int n : num) {
			if (n % 3 == 0 && n % 5 == 0) {
				count++;
			}
		}

		System.out.println(count + " number have divisible by 3 and 5");

	}
}
