package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintUniqueElement_9 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8, 9, 10);

		for (int n1 : num) {

			int count = 0;
			for (int n2 : num) {
				if (n1 == n2) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(n1);
			}
		}

	}
}
