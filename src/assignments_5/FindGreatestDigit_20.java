package assignments_5;

import java.util.Scanner;

public class FindGreatestDigit_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int max = 0;
		int i = 0;

		while (n != 0) {
			int digit = n % 10;
			if (max < digit) {
				max = digit;
			}
			n = n / 10;
			i++;
		}
		System.out.println("Greatest number : " + max);
	}
}
