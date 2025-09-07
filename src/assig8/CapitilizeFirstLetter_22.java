package assig8;

import java.util.Scanner;

public class CapitilizeFirstLetter_22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = s.nextLine();
		String newName = "";

		String[] words = name.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 0) {
				
				char ch = Character.toUpperCase(words[i].charAt(0));
				
				String remaining = words[i].substring(1).toLowerCase();
				
				newName = newName + ch + remaining + " ";
			}
		}
		
		newName = newName.trim();

		System.out.println(newName);
	}
}
