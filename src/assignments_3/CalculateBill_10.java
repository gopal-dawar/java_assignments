package assignments_3;

import java.util.Scanner;

public class CalculateBill_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total units of consumed : ");
		int units = sc.nextInt();

		if (units > 300) {
			int cost = units * 10;
			System.out.println("Cost : " + cost);
		} else {
			if (units >= 101 && units <= 300) {
				int cost = units * 7;
				System.out.println("Cost : " + cost);
			} else {
				int cost = units * 5;
				System.out.println("Cost : " + cost);
			}
		}
	}
}
