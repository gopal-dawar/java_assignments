package assignments_6;

import java.util.Scanner;

public class Menu_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int i = 0;
		do {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Exit");
			System.out.println("Enter operation : ");
			choice = sc.nextInt();
			i++;
		} while (choice != 4);
		System.out.println("Exited");
	}
}
