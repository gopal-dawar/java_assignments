package assignments_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintUnique_24 {
	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Set<Integer> num2 = new HashSet<>();
		num2.add(1);
		num2.add(2);
		num2.add(4);
		num2.add(3);

		for (int n1 : num1) {
			boolean b = false;
			for (int n2 : num2) {
				if (n1 == n2) {
					b = true;
					break;
				}
			}
			if (!b) {
				System.out.println(n1);
			}
		}
	}
}
