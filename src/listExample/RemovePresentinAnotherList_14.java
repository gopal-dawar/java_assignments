package listExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePresentinAnotherList_14 {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list1.add(7);
		list1.add(8);
		list1.add(2);
		list1.add(3);
		list1.add(1);

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (list1.get(j) == list2.get(i)) {
					list2.remove(i);
				}
			}
		}

	}
}
