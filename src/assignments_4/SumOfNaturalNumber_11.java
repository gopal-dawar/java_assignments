package assignments_4;

import java.util.Scanner;

public class SumOfNaturalNumber_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of natural number is : " + sum);
	}

}
