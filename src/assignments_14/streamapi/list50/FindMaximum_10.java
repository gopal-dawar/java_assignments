package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class FindMaximum_10 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53);

		System.out.println("Normal way");
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		System.out.println(max);

		System.out.println("Using stream api");
		int l = list.stream().max((x, y) -> x - y).get();
		System.out.println(l);
	}
}
