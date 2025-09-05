package assignments_3;

import java.util.Scanner;

public class CheckNumber_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		if (number > 0) {
			System.out.println("Positive");
		}else if (number == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Negetive");
		}
		
	}
}
