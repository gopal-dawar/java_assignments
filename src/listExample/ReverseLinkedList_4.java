package listExample;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList_4 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list.toString());
		
		System.out.print("Reverse Linked List : ");
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}
}
