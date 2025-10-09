package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class Divisibleby7Check_15 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("using loop");
		boolean b = false;
		for (int n : number) {
			if (n % 7 == 0) {
				b = true;
			}
		}
		System.out.println(b);

		System.out.println("using stream");

		boolean b1 = number.stream().anyMatch(x -> x % 7 == 0);
		System.out.println(b1);
	}
}
