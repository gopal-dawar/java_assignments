package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckElementsExistOrNot_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(42);
		list.add(52);
		list.add(62);
		list.add(72);
		list.add(72);
		boolean b = false;
		for (int a : list) {
			if (n == a) {
				b = true;
				break;
			} else {
				b = false;
			}
		}

		if (b) {
			System.out.println("It's Exist Here...!");
		} else {
			System.out.println("Not Exist Here...!");

		}

		sc.close();
	}
}
