package assignments_6;

import java.util.Scanner;

public class FindMaxDigit_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = 1;
		int max = 0;
		do {
			int digit = n % 10;
			if (max < digit) {
				max = digit;
			}
			n = n / 10;
			i++;
		} while (n != 0);

		System.out.println("Max : " + max);
		sc.close();
	}
}
