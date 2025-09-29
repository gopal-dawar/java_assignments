package listExample;

import java.util.LinkedList;
import java.util.List;

public class FindDublicate_6 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Befor removing dublicate : " + list.toString());
		System.out.print("Duplicate numbers : ");
		for(int i = 0; i < list.size();i++) {
			for(int j = i + 1; j < list.size();j++) {
				if (list.get(i) == list.get(j)) {
					System.out.print(list.get(i) + " ");
				}
			}
		}
		
		
	}
}
