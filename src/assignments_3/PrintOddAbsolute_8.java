package assignments_3;

import java.util.Scanner;

public class PrintOddAbsolute_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();

		System.out.println("Enter second number : ");
		int b = sc.nextInt();

		if (a % 2 == 0) {
			if (b % 2 == 0) {
				int diff = a - b;
				int abs = Math.abs(diff);
				System.out.println("Absolute is : " + abs);
			} else {
				System.out.println("Invalid");
			}
		} else {
			System.out.println("Invalid");
		}

	}
}
