package assignments_2;

import java.util.Scanner;

public class Factorial_11 {
	public static void main(String[] args) {
		Factorial_11 f1 = new Factorial_11();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int input = sc.nextInt();
		int fact = f1.fact(input);
		System.out.println("Factorial : " + fact);
	}

	public int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
