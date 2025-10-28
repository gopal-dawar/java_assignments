package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class FilterDuplicate_14 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);
		boolean[] flage = new boolean[list.size()];

		for (int i = 0; i < list.size(); i++) {
			if (flage[i]) {
				continue;
			}

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					flage[j] = true;
					break;
				}
			}

			if (!flage[i]) {
				System.out.println(list.get(i));
			}
			
		}

	}
}
