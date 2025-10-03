package assignments_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUniqueElement_9 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 8, 8, 9, 10);
		List<Integer> num1 = new ArrayList<Integer>();

		boolean[] b = new boolean[num.size()];
		for (int i = 0; i < num.size(); i++) {
			if (b[i]) {
				continue;
			}
			for (int j = 1; j < num.size(); j++) {
				if (num.get(i) == num.get(j)) {
					b[j] = true;
					break;
				}
			}
			if (b[i]) {
				num1.add(num.get(i));
			}
		}
		System.out.println(num1.toString());

	}
}
