package task_assignments_10;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements_6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);

		System.out.println("Befor remove");
		System.out.println(list.toString());

		list.remove(0);

		System.out.println("After remove");
		System.out.println(list.toString());
	}
}
