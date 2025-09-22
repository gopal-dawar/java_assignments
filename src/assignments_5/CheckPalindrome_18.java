package assignments_5;

import java.util.Scanner;

public class CheckPalindrome_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;

		int i = 0;
		while (n != 0) {

			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
			i++;
		}
		if (temp == reverse) {
			System.out.println(temp + " is palindrome number");
		} else {
			System.out.println(temp + " is not palindrome number");
		}
	}
}
