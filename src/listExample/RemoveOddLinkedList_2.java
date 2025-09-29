package listExample;

import java.util.LinkedList;
import java.util.List;

public class RemoveOddLinkedList_2 {
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
		System.out.println("before remove odd : " + list.toString());
		for(int i = 0; i < list.size();i++) {
			if(list.get(i) % 2 != 0) {
				list.remove(i);
			}
		}
		
		System.out.println("After remove odd : " + list.toString());
		
	}
}
