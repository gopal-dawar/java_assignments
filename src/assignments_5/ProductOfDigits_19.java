package assignments_5;

import java.util.Scanner;

public class ProductOfDigits_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int product = 1;
		int i = 0;
		while (n != 0) {
			int digit = n % 10;
			product = product * digit;
			n = n / 10;
			i++;
		}
		System.out.println("Product : " + product);

	}
}
