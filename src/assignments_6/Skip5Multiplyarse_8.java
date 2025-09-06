package assignments_6;

import java.util.Scanner;

public class Skip5Multiplyarse_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int i = 1;
		do {
			if (i % 5 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} while (i <= n);
		sc.close();
	}
}
