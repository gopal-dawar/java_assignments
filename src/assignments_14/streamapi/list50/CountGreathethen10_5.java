package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class CountGreathethen10_5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 8, 88, 12, 33, 25, 5);

		System.out.println("Normal way");
		int count = 0;
		for (int n : list) {
			if (n > 10) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("Using stream api");
		Long count1 = list.stream().filter(x -> x > 10).count();
		System.out.println(count1);

	}
}
