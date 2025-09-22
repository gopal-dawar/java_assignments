package assignments_2;

import java.util.Scanner;

public class SimpleInstrest_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount = sc.nextInt();
		
		System.out.println("Enter rate of instrest : ");
		int rate = sc.nextInt();
		
		System.out.println("Enter time : ");
		int time = sc.nextInt();
		
	     double simpleInterest = (amount * rate * time) / 100;
	     
	     
	     System.out.println("Simple instrate is : " + simpleInterest);
	     
	     sc.close();
	     
	}
}
