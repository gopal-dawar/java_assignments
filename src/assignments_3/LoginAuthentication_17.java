package assignments_3;

import java.util.Scanner;

public class LoginAuthentication_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter username : ");
		String username = sc.nextLine();
		
		System.out.println("Enter password : ");
		int password = sc.nextInt();
		
		String setUserName = "gopal";
		int setPassword = 1234;
		if (username.equals(setUserName) && setPassword == password) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Denied");
		}
	}
}
