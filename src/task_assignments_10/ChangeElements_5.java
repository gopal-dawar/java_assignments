package task_assignments_10;

import java.util.ArrayList;
import java.util.List;

public class ChangeElements_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(31);
		list.add(41);
		list.add(51);
		list.add(61);
		list.add(71);

		list.set(1, 33);

		System.out.println(list.toString());

	}
}
