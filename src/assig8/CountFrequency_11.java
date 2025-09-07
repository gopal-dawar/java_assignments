package assig8;

import java.util.Scanner;

public class CountFrequency_11{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = s.nextLine();
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 0; 
			if(name.charAt(i) == ' ' || name.indexOf(ch) < i) {
				continue;
			}
			
			
			for(int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == ch) {
					count++;
				}
			}
			System.out.print(ch + "=" + count + ", ");
		}
	}
}