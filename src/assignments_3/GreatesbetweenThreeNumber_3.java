package assignments_3;

import java.util.Scanner;

public class GreatesbetweenThreeNumber_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number : ");
		int n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is large number");
		}else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is large number");
		}else {
			System.out.println(n3 + " is large number");
		}
		
	}
}
