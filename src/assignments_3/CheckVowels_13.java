package assignments_3;

import java.util.Scanner;

public class CheckVowels_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);

		if ((Character.isLowerCase(ch) && ch == 'a') || (Character.isLowerCase(ch) && ch == 'i')
				|| (Character.isLowerCase(ch) && ch == 'u') || (Character.isLowerCase(ch) && ch == 'e')
				|| (Character.isLowerCase(ch) && ch == 'o')) {
			System.out.println(ch + " is vowels and its lowercase");
		} else if ((Character.isUpperCase(ch) && ch == 'a') || (Character.isUpperCase(ch) && ch == 'i')
				|| (Character.isUpperCase(ch) && ch == 'u') || (Character.isUpperCase(ch) && ch == 'e')
				|| (Character.isUpperCase(ch) && ch == 'o')) {
			System.out.println(ch + " is vowels and its Uppercase");
		} else if (Character.isUpperCase(ch)) {
			System.out.println(ch + " is consonant and its Uppercase");
		}else if (Character.isLowerCase(ch)) {
			System.out.println(ch + " is consonant and its lowercase");
		}

	}
}
