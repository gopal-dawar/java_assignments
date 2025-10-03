package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintCommanElement_23 {
	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10);

		for (int n1 : num1) {
			for (int n2 : num2) {
				if (n1 == n2) {
					System.out.println(n2);
				}
			}
		}

	}
}
