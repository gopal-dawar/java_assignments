package assignments_3;

import java.util.Scanner;

public class AgeChecker_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		if (age > 0 && age <= 12) {
			System.out.println("Child");
		}else if (age <= 17 && age >= 13) {
			System.out.println("Teen");
		}else if (age <= 59 && age >= 18) {
			System.out.println("Adult");
		}else if (age >= 60) {
			System.out.println("Senior");
		}
		
		
	}
}
