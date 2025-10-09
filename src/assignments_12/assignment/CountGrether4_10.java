package assignments_12.assignment;

import java.util.Arrays;
import java.util.List;

public class CountGrether4_10 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("using loop");
		int count = 0;
		for (int n : number) {
			if (n > 4) {
				count++;
			}
		}
		System.out.println("Greater then 4 is : " + count);
		System.out.println("using stream");

		Long c = number.stream().filter(x -> x > 4).count();
		System.out.println("Greater then 4 is : " + c);
	}
}
