package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRAndSortAndStoreList_31 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes", "Cherry", "Banana", "Strawberry");

		List<String> newList = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(newList);
	}
}
