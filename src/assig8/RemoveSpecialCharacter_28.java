package assig8;

import java.util.Scanner;

public class RemoveSpecialCharacter_28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = s.nextLine();
		
		String newString = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(newString);
	}
}
