package assignments_4;

import java.util.Scanner;

public class ReverseDigit_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digtis : ");
		int n = sc.nextInt();
		int reverse = 0;

		for (int i = 0; n != 0; i++) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		
		System.out.println("Reverse digit is : " + reverse);
	}
}
