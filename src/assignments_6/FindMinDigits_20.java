package assignments_6;

import java.util.Scanner;

public class FindMinDigits_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int min = 9;
		int i = 1;
		do {
			int digit = n % 10;
			if (min > digit) {
				min = digit;
			}
			n = n / 10;
			i++;
		} while (n != 0);
		System.out.println("Min : " + min);
		sc.close();
	}
}
