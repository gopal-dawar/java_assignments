package assignments_3;

import java.util.Scanner;

public class GradeCalculator_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("A Grade");
		}else if (marks <= 89 && marks >= 80) {
			System.out.println("B Grade");
		}else if (marks <= 79 && marks >= 70) {
			System.out.println("C Grade");
		}else if (marks <=  69 && marks >= 60) {
			System.out.println("D Grade");
		}else if (marks < 60) {
			System.out.println("Fail");
		}
	}
}
