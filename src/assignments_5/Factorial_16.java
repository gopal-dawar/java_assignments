package assignments_5;

import java.util.Scanner;

public class Factorial_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = n;
		int fact = 1;
		while (i >= 1) {
			fact = fact * i;
			i--;
		}
		
		System.out.println("Factorial : " + fact);
	}
}
