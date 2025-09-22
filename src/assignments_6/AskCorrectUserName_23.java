package assignments_6;

import java.util.Scanner;

public class AskCorrectUserName_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = sc.nextLine();
		
		do {
			if (!(username.equals("gopal"))) {
				System.out.println("Enter correct username : ");
				username = sc.nextLine();
			}
		} while (!(username.equals("gopal")));
		System.out.println("Login Successfull");
	}
}
