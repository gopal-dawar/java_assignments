package assignments_3;

import java.util.Scanner;

public class ATMWithdrawal_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = 20000;
		System.out.println("Enter balance : ");
		int balence = sc.nextInt();

		if (balence % 2 == 0 && balence >= 100) {
			amount = amount + balence;
			System.out.println("Total amount : " + amount);
			System.out.println("Approve");
		}else {
			System.out.println("Reject it");
		}

	}
}
