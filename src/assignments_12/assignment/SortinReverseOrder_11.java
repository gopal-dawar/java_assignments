package assignments_12.assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortinReverseOrder_11 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(7, 8, 2, 3, 1);

		System.out.println("using loop");
		for (int i = 0; i < number.size(); i++) {
			for (int j = 0; j < number.size(); j++) {
				if (number.get(i) > number.get(j)) {
					int temp = number.get(j);
					number.set(j, number.get(i));
					number.set(i, temp);
				}
			}
		}
		
		for(int n : number) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println("using stream");
		number.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
	}
}
