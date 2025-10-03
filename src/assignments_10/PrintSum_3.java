package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintSum_3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = 0;
		for (int n : list) {
			sum = sum + n;
		}

		System.out.println("Sum : " + sum);
	}
}
