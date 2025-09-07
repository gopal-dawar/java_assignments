package assig8;

import java.util.Scanner;

public class CheckUnique_29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = s.nextLine();
		boolean b = true;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					b = false;
					break;
				}
			}
			if (!b)
				break;
		}

		if (b) {
			System.out.println("All character are unique in string");
		} else {
			System.out.println("String has duplicate characters");
		}
	}
}
