package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class Printfirst5Element_12 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		for (int i = 0; i < 5; i++) {
			System.out.println(number.get(i));
		}

		System.out.println("using stream");

		number.stream().limit(5).forEach(System.out::println);

	}
}
