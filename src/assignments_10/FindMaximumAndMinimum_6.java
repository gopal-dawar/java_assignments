package assignments_10;

import java.util.Arrays;
import java.util.List;

public class FindMaximumAndMinimum_6 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(7, 8, 2, 3, 1, 0);
		int max = num.get(0);
		int min = num.get(0);
		for (int n : num) {
			if (n > max) {
				max = n;
			}

			if (n < min) {
				min = n;
			}
		}

		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
}
