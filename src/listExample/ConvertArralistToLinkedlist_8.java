package listExample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvertArralistToLinkedlist_8 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		List<Integer> list2 = new LinkedList<>();

		for (int i = 0; i < list1.size(); i++) {
			list2.add(list1.get(i));
		}
		
		System.out.println(list2.toString());
	}
}
