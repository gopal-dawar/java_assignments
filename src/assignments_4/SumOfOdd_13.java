package assignments_4;

import java.util.Scanner;

public class SumOfOdd_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0;i<= n;i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("Sum of odd number : " + sum);		
	
	}
}
