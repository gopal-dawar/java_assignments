package assignments_6;

import java.util.Scanner;

public class AskPassword3Time_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int i = 0;
		do {
			System.out.println("Enter password : ");
			String password = sc.nextLine();
			count++;
			if (!(password.equals("gopal"))) {
				System.out.println("Enter correct : ");
				password = sc.nextLine();
			}
			i++;
		} while (count != 3);
		System.out.println("Login Successfull");
	}
}
