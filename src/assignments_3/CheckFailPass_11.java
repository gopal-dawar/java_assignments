package assignments_3;

import java.util.Scanner;

public class CheckFailPass_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject mark : ");
		int mark1 = sc.nextInt();

		System.out.println("Enter second subject mark : ");
		int mark2 = sc.nextInt();

		System.out.println("Enter third subject mark : ");
		int mark3 = sc.nextInt();

		if (mark1 < 33 || mark2 < 33 || mark3 < 33) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
		}
	}
}
