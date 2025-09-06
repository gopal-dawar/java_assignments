package assignments_6;

import java.util.Scanner;

public class Factorial_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int fact = 1;
		int i = n;
		do {
			fact = fact * i;
			i--;
		} while (i >= 1);
		System.out.println("Factorial : " + fact);
	}
}
