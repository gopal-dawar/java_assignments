package assignments_6;

import java.util.Scanner;

public class PrintSquares_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = 1;
		do {
			System.out.println(i * i);
			i++;
		} while (i <= n);
		sc.close();
	}
}
