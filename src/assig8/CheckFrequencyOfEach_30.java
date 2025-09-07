package assig8;

import java.util.Scanner;

public class CheckFrequencyOfEach_30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String str = s.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ' || str.indexOf(ch) < i) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}

			System.out.println(ch + " = " + count);
		}
	}
}
