package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class PrintGreath5_7 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("using loop");
		for (int n : number) {
			if (n > 5) {
				System.out.println(n);
			}
		}
		System.out.println("using stream");
		number.stream().filter(x -> x > 5).forEach(System.out::println);
	}
}
