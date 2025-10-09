package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class ExtractEven_1 {
	public static void main(String[] args) {
		System.out.println("Using for loop ");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for(int n: numbers) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		
		System.out.println("Using Stream api");
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	}
}
