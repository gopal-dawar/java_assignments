package assig8;

import java.util.Scanner;

public class ReplaceHyphens_21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter full name : ");
		String name = s.nextLine();
		String newString = "";
		for(int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ' ) {
				newString = newString + '-';
			}else {
				newString = newString + name.charAt(i);
			}
		}
		System.out.println("New String : " + newString);
	}
}
