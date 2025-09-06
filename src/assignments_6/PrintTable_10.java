package assignments_6;

import java.util.Scanner;

public class PrintTable_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 1;

		do {
			System.out.println(i * n);
			i++;
		} while (i <= 10);
		sc.close();
	}
}
