package assig8;

import java.util.Scanner;

public class CompressString_24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String name = s.nextLine();
		String newString = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 1;

			if (name.indexOf(ch) < i) {
				continue;
			}

			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(j) == ch) {
					count++;
				}
			}
			newString = newString + ch + String.valueOf(count);
		}

		System.out.println("Compressed string: " + newString);
	}
}
