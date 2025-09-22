package assignments_6;

import java.util.Scanner;

public class CheckEvenOdd_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		do {
			int digit = n % 10;
			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			n = n / 10;
		} while (n != 0);

		if (even > odd) {
			System.out.println("Even : " + even);
		} else {
			System.out.println("Odd : " + odd);
		}
	}
}
