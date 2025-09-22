package assignments_6;

import java.util.Scanner;

public class EnterValidAge_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();

		do {
			if (!(age >= 1 && age <= 120)) {
				System.out.println("Enter valis age : ");
				age = sc.nextInt();
			}

		} while (!(age >= 1 && age <= 120));
		System.out.println("Valid!");
	}
}
