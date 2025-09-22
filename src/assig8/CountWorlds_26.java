package assig8;

import java.util.Scanner;

public class CountWorlds_26 {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = s.nextLine();
		
		String[] newStrings = name.trim().split(" "); 
		int count = 0;
		for(int i = 0; i < newStrings.length;i++) {
			count++;
		}
		
		System.out.println("words : " + count);
	}
}
