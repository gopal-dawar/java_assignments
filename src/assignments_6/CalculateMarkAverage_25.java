package assignments_6;

import java.util.Scanner;

public class CalculateMarkAverage_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int count = 0;
		int total = 0;
		
		do {
			System.out.println("Enter marks (enter 0 or negative to stop): ");
			choice = sc.nextInt();
			
			if (choice > 0) {  
				total = total + choice;
				count++;
			}
			
		} while (choice > 0); 
		if (count > 0) {
			double average = (double) total / count;
			System.out.println("Average : " + average);
		} else {
			System.out.println("No marks entered!");
		}
		
		sc.close();
	}
}
