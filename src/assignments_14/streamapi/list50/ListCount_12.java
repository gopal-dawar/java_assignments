package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class ListCount_12 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53);

		System.out.println("Normal Ways");
		int count = 0;
		for (int n : list) {
			count++;
		}
		System.out.println(count);
		System.out.println("Using stream api");
		Long l = list.stream().count();
		System.out.println(l);
	}
}
