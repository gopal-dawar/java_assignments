package assignments_10;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateString_22 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Gopal", "Sairam", "Dawar", "Gopal", "Chetan", "Nakul", "Chetan");

		boolean[] b = new boolean[names.size()];
		for (int i = 0; i < names.size(); i++) {
			if (b[i])
				continue;

			for (int j = i + 1; j < names.size(); j++) {
				if (names.get(i) == names.get(j)) {
					b[j] = true;
					break;
				}
			}

			if (!b[i]) {
				System.out.println(names.get(i));
			}
		}
	}
}
