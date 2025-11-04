package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString_46 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic");

		String ls = list.stream().max(Comparator.comparing(String::length)).orElse(null);
		System.out.println(ls);
		System.out.println(ls.length());
		
		
		
		
	}
}
