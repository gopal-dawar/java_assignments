package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWithPalindromeOnly_41 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic");

		List<String> l = list.stream().filter(x -> x.equalsIgnoreCase(new StringBuilder(x).reverse().toString()))
				.collect(Collectors.toList());
		
		System.out.println(l.toString());
	}

}
