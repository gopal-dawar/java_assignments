package assignments_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintNumber_21 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9);

		Set<Integer> set = new HashSet<>();

		for (int n : list) {
			set.add(n);
		}
		
		System.out.println(list.toString());
		System.out.println(set.toString());
	}
}
