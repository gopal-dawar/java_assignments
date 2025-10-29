package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JointStringWith_30 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");

		String line = list.stream().collect(Collectors.joining("-"));
		System.out.println(line);

	}
}
