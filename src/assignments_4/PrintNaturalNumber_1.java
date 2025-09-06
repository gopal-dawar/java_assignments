package assignments_4;

import java.util.Scanner;

public class PrintNaturalNumber_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);

		}
		sc.close();
	}

}
