package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class FindMininum_11 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53);

		System.out.println("Normal way");
		int mini = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (mini > list.get(i)) {
				mini = list.get(i);
			}
		}
		System.out.println(mini);

		System.out.println("Using Stream api");
		int l = list.stream().min((x, y) -> x - y).get();
		System.out.println(l);

	}
}
