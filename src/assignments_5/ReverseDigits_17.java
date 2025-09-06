package assignments_5;

import java.util.Scanner;

public class ReverseDigits_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int reverse = 0;

		int i = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
			i++;
		}
		
		System.out.println("Reverse : " + reverse);
	}
}
