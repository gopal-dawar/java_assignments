package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class CheckEAndLength_32 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes", "Cherry", "Banana", "Strawberry");

		list.stream().filter(x -> x.length() >= 4).filter(x -> x.contains("e")).forEach(System.out::println);

	}
}
