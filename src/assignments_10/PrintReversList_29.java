package assignments_10;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PrintReversList_29 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		ListIterator<Integer> it = num.listIterator(num.size());
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}


	}
}
