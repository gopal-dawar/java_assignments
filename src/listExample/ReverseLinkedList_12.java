package listExample;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList_12 {
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();

		list1.add(7);
		list1.add(8);
		list1.add(2);
		list1.add(3);
		list1.add(1);

		System.out.println(list1.toString());

		System.out.println();
		System.out.print("Reverse linkedlist : ");
		for(int i = list1.size() - 1; i >= 0; i--) {
			System.out.print(list1.get(i) + " ");
		}
	}
}
