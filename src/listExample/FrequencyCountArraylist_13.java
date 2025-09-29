package listExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FrequencyCountArraylist_13 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(7);
		list1.add(7);
		list1.add(8);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		list1.add(1);

		System.out.println(list1.toString());
		
		
		boolean[] b = new boolean[list1.size()];
		
		for(int i = 0; i < list1.size();i++) {
			if (b[i]) {
				continue;
			}
			int count = 1;
			for(int j = i + 1; j < list1.size();j++) {
				if (list1.get(i) == list1.get(j)) {
					b[j] = true;
					count++;
				}
			}
			
			System.out.println(list1.get(i) + " is appear : " + count + " time");
			
		}
	}
}
