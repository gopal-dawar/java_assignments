package assignments_4;

import java.util.Scanner;

public class RaisedPower_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter base number: ");
		int base = sc.nextInt();

		System.out.print("Enter exponent number: ");
		int exponent = sc.nextInt();

		double result = Math.pow(base, exponent);

		System.out.println(base + " raised to the power " + exponent + " is: " + result);
	}
}
