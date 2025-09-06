package assignments_4;

import java.util.Scanner;

public class CheckPalindrome_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int n = num;
		int reverse = 0;

		for (int i = 0; n != 0; i++) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}

		System.out.println(reverse);
		
		if (num == reverse) {
			System.out.println(num + " is Palindrome number");
		} else {

			System.out.println(num + " is not  Palindrome number");
		}
	}
}
