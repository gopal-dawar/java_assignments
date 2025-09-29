package listExample;

import java.util.Arrays;
import java.util.List;

public class FindSecondLarge_5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 1, 2, 3, 4, 5, 5, 6, 6, 7, 1, 22, 44, 55);

		int secondlarge = 0;
		int large = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (large < list.get(i)) {
				secondlarge = large;
				large = list.get(i);
			}
		}

		System.out.println(secondlarge);

	}
}
