package assignments_6;

import java.util.Scanner;

public class CheckReverseEven_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int reverse = 0;
		do {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		} while (n != 0);
		
		if (reverse % 2 == 0) {
			System.out.println(reverse + " is even");
		}else {
			System.out.println(reverse + " not even");
		}
	}
}
