package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class PrintListElements_1 {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		System.out.println("Normal way");
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

		System.out.println("Using stream api");
		l1.stream().forEach((x) -> System.out.println(x));
	}
}
