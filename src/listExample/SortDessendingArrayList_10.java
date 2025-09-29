package listExample;

import java.util.ArrayList;
import java.util.List;

public class SortDessendingArrayList_10 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();

		list1.add(7);
		list1.add(8);
		list1.add(2);
		list1.add(3);
		list1.add(1);
	
		System.out.println(list1.toString());

		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				if (list1.get(i) < list1.get(j)) {
					int temp = list1.get(j);
					list1.set(j,list1.get(i));
					list1.set(i, temp);
				}
			}
		}
		
		System.out.println(list1.toString());

	}
}
