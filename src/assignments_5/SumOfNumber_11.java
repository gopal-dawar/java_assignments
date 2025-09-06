package assignments_5;

import java.util.Scanner;

public class SumOfNumber_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum : " + sum);
		sc.close();
	}
}
