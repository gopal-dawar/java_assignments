package assignments_3;

import java.util.Scanner;

public class OddEvenChain_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int n3 = sc.nextInt();

		if (n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0) {
			System.out.println("Even Chain");
		} else if (n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0) {
			System.out.println("Odd Chain");
		}else {
			System.out.println("Mixed Chain");
		}

	}
}
