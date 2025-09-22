package assignments_5;

import java.util.Scanner;

public class SumOfDigits_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits : ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
			i++;
		}
		System.out.println("Sum of digits : " + sum);

	}
}
