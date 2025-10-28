package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class PrintEven_2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9);
		System.out.println("Normal ways");
		for (int n : list) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

		System.out.println("Using stream api ");
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

	}
}
