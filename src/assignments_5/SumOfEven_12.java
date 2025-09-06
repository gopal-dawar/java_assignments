package assignments_5;

import java.util.Scanner;

public class SumOfEven_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		int sum = 0;

		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum is : " + sum);
	}
}
