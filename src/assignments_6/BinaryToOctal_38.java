package assignments_6;

import java.util.Scanner;

public class BinaryToOctal_38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		String binary = sc.nextLine();
		int decimal = Integer.parseInt(binary, 2);
		String octal = Integer.toOctalString(decimal);
		System.out.println("Binary: " + binary);
		System.out.println("Octal : " + octal);
		sc.close();
	}
}
