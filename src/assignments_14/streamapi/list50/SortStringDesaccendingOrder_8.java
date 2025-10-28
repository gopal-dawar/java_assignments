package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringDesaccendingOrder_8 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");
		System.out.println("Normal way");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Using stream api");
		list.stream().sorted().forEach(System.out::println);

	}
}
