package assignments_6;

import java.util.Scanner;

public class Series2_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 1;
		System.out.print("Series : ");
		do {
			System.out.print("1/" + i);
			if (i < n) {
				System.out.print(" + ");
			}
			i++;
		} while (i <= n);
	}
}
