package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class AddandPrintinSet_11 {
	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();
		num.add(3);
		num.add(7);
		num.add(8);
		num.add(1);
		num.add(2);
		num.add(1);
//		num.add(3);
		num.add(4);
		num.add(5);


		System.out.println(num.toString());

	}
}
