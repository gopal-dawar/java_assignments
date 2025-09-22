package assignments_6;

import java.util.Scanner;

public class ReverseNumber_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = n;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);
		sc.close();
	}
}
