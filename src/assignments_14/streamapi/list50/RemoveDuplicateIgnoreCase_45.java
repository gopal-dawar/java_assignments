package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateIgnoreCase_45 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes", "madam", "racecar", "banana", "level", "apple", "noon", "civic");

		list.stream().map(x -> x.toLowerCase()).distinct().forEach(System.out::println);

	}

}
