package assignments_3;

import java.util.Scanner;

public class ChoiceMenu_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. add ");
		System.out.println("2. Substraction");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide");
		
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Addition");
		} else {
			if (choice == 2) {
				System.out.println("Substraction");
			} else {
				if (choice == 3) {
					System.out.println("Multiply");
				} else {
					if (choice == 4) {
						System.out.println("Divide");
					}

				}
			}
		}

	}
}
