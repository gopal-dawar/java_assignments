package assig8;

import java.util.Scanner;

public class ShiftCharacterByOne_23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = s.nextLine();
		String newString = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) ((ch - 'a' + 1) % 26 + 'a');
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) ((ch - 'A' + 1) % 26 + 'A');
			}
			
			newString = newString + ch;
		}
		System.out.println("Sifted String : " + newString);
	}
}
