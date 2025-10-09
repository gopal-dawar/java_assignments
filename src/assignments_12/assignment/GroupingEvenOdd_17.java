package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEvenOdd_17 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Using loop");
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int n : number) {
			if (n % 2 == 0) {
				even.add(n);
			} else {
				odd.add(n);
			}
		}

		System.out.println("Even is : " + even.toString());
		System.out.println("Odd is : " + odd.toString());

		System.out.println("using stream ");

		Map<String, List<Integer>>  grouped =number.stream().collect(Collectors.groupingBy(x -> x % 2 != 0 ? "false" : "true"));

		System.out.println(grouped);
	}
}
