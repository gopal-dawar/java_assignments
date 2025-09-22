package assignments_6;

import java.util.Scanner;

public class PrintLeftToRightDigits_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int reverse = 0;

		do {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		} while (n != 0);

		for (int i = 0; reverse != 0; i++) {
			int digit = reverse % 10;
			System.out.print(digit + " ");
			reverse = reverse / 10;
		}
	}
}
