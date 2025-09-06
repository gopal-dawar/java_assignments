package assignments_6;

import java.util.Scanner;

public class Series1_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 1;
		int digit = 2;
		do {
			System.out.print(digit + " ");
			digit = digit * 2;
			i++;
		} while (i <= n);

	}
}
