package assig8;

import java.util.Scanner;

public class ReverseIndividual_27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String sentance = s.nextLine();

		int count = 0;

		String[] words = sentance.split(" ");
		String newsString = "";
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			newsString = words[i];
			for (int j = newsString.length() - 1; j >= 0; j--) {
				char ch = newsString.charAt(j);
				reverseString = reverseString + ch;
			}
			reverseString =  reverseString + " ";
		}
		System.out.println("Reverse String individually : " + reverseString);
	}
}
