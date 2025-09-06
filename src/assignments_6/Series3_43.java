package assignments_6;

import java.util.Scanner;

public class Series3_43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 1;
		int next = 0;

		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.print(c + " ");
		int i = 4;
		do {
			next = a + b + c;
			System.out.print(next + " ");
			a = b;
			b = c;
			c = next;

			i++;
		} while (i <= n);

	}
}
