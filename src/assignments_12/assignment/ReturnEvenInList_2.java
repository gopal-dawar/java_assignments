package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnEvenInList_2 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Using loop ");

		List<Integer> l1 = new ArrayList<>();
		for(int n : number) {
			if (n % 2 == 0) {
				l1.add(n);
			}
		}
		
		System.out.println(l1.toString());
		System.out.println("Using stream ");
		
		List<Integer> l2 = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(l2.toString());
		
	}
}
