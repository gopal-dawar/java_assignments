package assignments_5;

import java.util.Scanner;

public class PrintNaturalNumber_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = 1;

		while (i <= n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}
}
