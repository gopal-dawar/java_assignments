package task;

import java.util.ArrayList;
import java.util.List;

public class AddElementsUsingIndex_3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		list.add(2, 12);

		for (int n : list) {
			System.out.println(n);
		}
	}
}
