package assig8;

import java.util.Scanner;

public class TagleEachCase_20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = s.nextLine();
		String newString = "";
		
		for(int i = 0; i < name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				newString = newString + Character.toLowerCase(ch);
			}else {
				newString = newString + Character.toUpperCase(ch);
			}
		}
		System.out.println("Toggle string : " + newString);
	}
}
