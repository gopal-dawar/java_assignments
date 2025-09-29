package listExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrayList_7 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		List<Integer> list3 = new ArrayList<>();

		for (int i = 0; i < list1.size(); i++) {
			list3.add(list1.get(i));
		}

		for(int i = 0; i < list2.size();i++) {
			list3.add(list2.get(i));
		}
		
		System.out.println(list3.toString());
	}
}
