package assignments_3;

import java.util.Scanner;

public class PrintEevenOnlu_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();

		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			if (n1 % 2 == 0) {
				System.out.println(n1 + " is is even and larger");
			}
		} else {
			if (n1 % 2 == 0) {
				System.out.println(n1 + " is even but smaller");
			}
		}
		if (n2 > n1) {
			if (n2 % 2 == 0) {
				System.out.println(n2 + " is is even and larger");
			}
		} else {
			if (n2 % 2 == 0) {
				System.out.println(n2 + " is even but smaller");
			}
		}
	}

}
