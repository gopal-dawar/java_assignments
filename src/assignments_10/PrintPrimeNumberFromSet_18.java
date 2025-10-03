package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class PrintPrimeNumberFromSet_18 {
	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(9);
		num.add(10);

		System.out.print("Prime numbers : ");
		for (int n : num) {
			boolean b = true;
			if (n <= 1) {
				b = false;
			} else {
				for (int i = 2; i <= n / 2; i++) {
					if (n % i == 0) {
						b = false;
						break;
					}
				}
			}
			if (b) {
				System.out.print(n + " ");
			}
		}

	}
}
