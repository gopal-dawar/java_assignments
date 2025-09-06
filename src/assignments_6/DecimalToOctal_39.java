package assignments_6;

import java.util.Scanner;

public class DecimalToOctal_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		int decimal = sc.nextInt();

		int n = decimal;
		String octal = "";

		while (n > 0) {
			int remainder = n % 8;
			octal = remainder + octal;
			n = n / 8;
		}

		System.out.println("Decimal: " + decimal);
		System.out.println("Octal  : " + octal);

		sc.close();
	}
}
