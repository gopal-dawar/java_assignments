package assig8;

import java.util.Scanner;

public class FindSecondMost_25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String name = s.nextLine();
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 0;
			if(ch == ' ' || name.indexOf(ch) < i) {
				continue;
			}
			
			for(int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == ch) {
					count++;
				}
			}
			if (count >= 2) {
				System.out.print(ch +" = "+count + ", ");
			}
		}
	}
}
