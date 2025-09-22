package assig8;

import java.util.Scanner;

public class ASCIIsum_15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = s.nextLine();
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int ascii = ch;
			System.out.println(ch + " = " + ascii);
		}
	}
}
