package assig8;

import java.util.Scanner;

public class ExtractDigit_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string with digits : ");
		String stringWithDigits = s.nextLine();
		String  digits = "";
		for(int i = 0; i < stringWithDigits.length(); i++) {
			char ch = stringWithDigits.charAt(i);
			
			if (Character.isDigit(ch)) {
				digits = digits + ch;
			}
		}
		System.out.println("Digits : " + digits);
		
	}
}
