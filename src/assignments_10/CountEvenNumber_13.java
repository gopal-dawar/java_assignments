package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class CountEvenNumber_13 {
	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();
		num.add(7);
		num.add(8);
		num.add(2);
		num.add(3);
		num.add(1);
		int count = 0;
		for (int n : num) {
			if (n % 2 == 0) {
				count++;
			}
		}

		System.out.println("Even number have : " + count);

	}
}
