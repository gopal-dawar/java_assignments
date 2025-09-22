package assignments_3;

import java.util.Scanner;

public class VotingSystem_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter citizenship (y/n) : ");
		char citizenship = sc.next().charAt(0);
		
		if (age >= 18 && (citizenship == 'y' || citizenship == 'Y')) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("not eligible to vote");
		}
	}
}
