package assignments_14.streamapi.list50;

import java.util.ArrayList;
import java.util.List;

public class SortIntegerAccendingOrder_7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(8);
		list.add(2);
		list.add(3);
		list.add(1);

		System.out.println("Normal way");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list.toString());

		System.out.println("Using stream api");
		list.stream().sorted().forEach(x -> System.out.print(x + " "));
	}
}
