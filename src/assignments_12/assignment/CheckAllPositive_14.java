package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CheckAllPositive_14 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(-9, -7, -6, -4, -3, -1, 1, 2, 3, 4, 5, 6, 7);

		System.out.println("using loop");
		boolean b = false;
		for (int n : number) {
//			b = false;
			if (n < 0) {
				b = true;
				break;
			}
		}
		if (!b) {
			System.out.println("All have positive number!");
		} else {
			System.out.println("Negetiv number exist in list!");
		}
		System.out.println("using stream");
 
		boolean b1 = number.stream().anyMatch(x -> x < 0);
		if (b1) {
			System.out.println("Negetiv number exist in list!");
		} else {
			System.out.println("All have positive number!");
		}
	}
}
