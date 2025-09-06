package assignments_6;

import java.util.Scanner;

public class SumOfDigits_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		do {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
			i++;
		} while (n != 0);
		System.out.println("Sum : " + sum);
	}
}
