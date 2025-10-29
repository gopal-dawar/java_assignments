package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LowestSecond_25 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		Optional<Integer> slarge = list.stream().distinct().sorted().skip(1).findFirst();
		System.out.println("Second lowest : " + slarge.get());
	}
}
