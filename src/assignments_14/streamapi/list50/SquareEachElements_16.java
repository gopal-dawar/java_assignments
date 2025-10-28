package assignments_14.streamapi.list50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEachElements_16 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		System.out.println("Normal way");
		List<Integer> result1 = new ArrayList<Integer>();

		for (int n : list) {
			result1.add(n * n);
		}
		
		System.out.println(result1.toString());
		
		System.out.println("Using stream api");
		List<Integer> result2 = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(result2);
	}
}
