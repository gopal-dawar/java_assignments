package assignments_14.streamapi.list50;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectOddInNewList_20 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);
		System.out.println("Normal way");

		List<Integer> result1 = new ArrayList<Integer>();

		for (int n : list) {
			if (n % 2 != 0) {
				result1.add(n);
			}
		}

		System.out.println(result1.toString());
		System.out.println("Using stream api");
		List<Integer> odd = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		System.out.println(odd.toString());
	}
}
