package assignments_5;

import java.util.Scanner;

public class PrintEvenNumber_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}
}
