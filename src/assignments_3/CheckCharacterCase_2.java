package assignments_3;

import java.util.Scanner;

public class CheckCharacterCase_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter single character : ");
		char ch = sc.next().charAt(0);

		if (Character.isLowerCase(ch)) {
			System.out.println(ch + " is lowercase");
		} else if (Character.isUpperCase(ch)) {
			System.out.println(ch + " is Uppercase");
		} else if (Character.isDigit(ch)) {
			System.out.println(ch + " is Digit");
		} else {
			System.out.println(ch + " is special symbol");
		}
	}
}
