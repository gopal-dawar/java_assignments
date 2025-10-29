package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class Skip3Elements_34 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		list.stream().skip(3).forEach(System.out::println);

	}
}
