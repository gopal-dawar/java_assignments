package assignments_4;

import java.util.Scanner;

public class Factorial_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i = n; i >= 1;i--) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}
}
