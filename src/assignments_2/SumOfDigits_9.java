package assignments_2;

import java.util.Scanner;

public class SumOfDigits_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 0; n != 0; i++) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}

		System.out.println("Sum is : " + sum);

	}
}
