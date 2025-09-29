package listExample;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReplaceAccurence_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for replace : ");
		int n = sc.nextInt();
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 5, 6);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.set(j, n);
				}
			}
		}

		System.out.println(list.toString());

	}
}
