package assig8;

import java.util.Scanner;

public class CheckAlphabetic_14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mix string : ");
		String mixString = s.nextLine();
		boolean b1 = true;

		for (int i = 0; i < mixString.length(); i++) {
			char ch = mixString.charAt(i);
			if (Character.isDigit(ch)) {
				b1 = true;
			} else {
				b1 = false;
			}
		}
		if (b1) {
			System.out.println("Given string is mix");
		} else {
			System.out.println("Given string is alphabetic ");

		}
	}
}
