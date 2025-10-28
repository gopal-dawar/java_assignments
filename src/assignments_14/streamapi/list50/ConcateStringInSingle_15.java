package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateStringInSingle_15 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");
		String line = "";
		System.out.println("Normal way");
		for (int i = 0; i < list.size(); i++) {
			line = line + list.get(i);
			if (i != list.size() - 1) {
				line = line + ",";
			}
		}
		System.out.println(line);

		System.out.println("Using stream api");

		String result = list.stream().collect(Collectors.joining(","));
		System.out.println(result);	
	}
}
