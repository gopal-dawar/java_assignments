package assignments_6;

import java.util.Scanner;

public class CountDigits_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 0;
		do {
			i++;
			n = n / 10;
		} while (n != 0);
		System.out.println("Count : " + i);
		sc.close();
	}
}
