package task_assignments_10;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayList_9 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(42);
		list.add(52);
		list.add(62);
		list.add(72);
	
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}

	}
}
