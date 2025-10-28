package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class CheckGreather3Stringlength_18 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");

		System.out.println("Normal way");
		for (String str : list) {
			if (str.length() >= 3) {
				System.out.println(str);
			}
		}

		System.out.println("Using stream api");
		list.stream().filter(x -> x.length() >= 3).forEach(System.out::println);
	}
}
