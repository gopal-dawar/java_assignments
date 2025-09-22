package assig8;

import java.util.Scanner;

public class CountIndividual_27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = s.nextLine();
		String newString = "";
		String reverString = "";
		String reverseStrings = "";

		String[] arrStrings = name.trim().split(" ");
		int count = 0;
		for (int i = 0; i < arrStrings.length; i++) {
			newString = newString + arrStrings[i];
			
			for (int j = newString.length() - 1; j >= 0; j--) {
				char ch = newString.charAt(j);
				reverString = reverString + ch;
			}
			
		reverseStrings = reverseStrings + " " + reverString;
		}
		System.out.print(reverseStrings);
		
	}
}
