package assig8;

import java.util.Scanner;

public class CheckPalindromeString_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = s.nextLine();
		
		String newString = "";
		
		for(int i = name.length()-1; i >= 0; i--) {
			newString = newString + name.charAt(i);
		}
		
		if(name.equals(newString)) {
			System.out.println("Given String is palindrome ");
		}else {
			System.out.println("Given String is not palindrome ");
		}
	}
}
