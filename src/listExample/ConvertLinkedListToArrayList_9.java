package listExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArrayList_9 {
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);

		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			list2.add(list1.get(i));
		}

		
		System.out.println(list2.toString());
	}
}
