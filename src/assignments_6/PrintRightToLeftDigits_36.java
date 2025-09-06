package assignments_6;

import java.util.Scanner;

public class PrintRightToLeftDigits_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		do {
			int digit = n % 10;
			System.out.print(digit + " ");
			n = n / 10;
		} while (n != 0);
	}
}
