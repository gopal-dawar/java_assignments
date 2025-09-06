package assignments_6;

import java.util.Scanner;

public class ProductOfDigits_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int proudct = 1;
		int i = 1;
		do {
			int digit = n % 10;
			proudct = proudct * digit;
			n = n / 10;
			i++;
		} while (n != 0);
		
		System.out.println("Products : " + proudct);
		sc.close();

	}
}
