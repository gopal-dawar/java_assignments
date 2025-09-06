package assignments_6;

import java.util.Scanner;

public class CountOddDigits_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits : ");
		int n = sc.nextInt();
		int count = 0;
		do {
			int digit = n % 10;
			if (digit % 2 != 0) {
				count++;
			}
			n = n / 10;
		} while (n != 0);
System.out.println("Odd are " + count + " digits");
	}
}
