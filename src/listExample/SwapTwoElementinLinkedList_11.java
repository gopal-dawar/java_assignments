package listExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoElementinLinkedList_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<>();

		list1.add(7);
		list1.add(8);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		System.out.println(list1.toString());

		System.out.println("Enter two number for swap in list : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int idex1 = list1.indexOf(n1);
		int idex2 = list1.indexOf(n2);

		list1.set(idex1, n2);
		list1.set(idex2, n1);

		System.out.println(list1.toString());

		sc.close();
	}
}
