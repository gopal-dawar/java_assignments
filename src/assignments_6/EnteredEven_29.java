package assignments_6;

import java.util.Scanner;

public class EnteredEven_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even : ");
		int even = sc.nextInt();

		do {
			if (!(even % 2 == 0)) {
				System.out.println("Enter even number : ");
				even = sc.nextInt();
			}
		} while (!(even % 2 == 0));
		System.out.println(even + " is even number");
	}
}
