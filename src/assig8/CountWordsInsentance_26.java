package assig8;

import java.util.Scanner;

public class CountWordsInsentance_26 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string : ");
		String sentance = s.nextLine();
		
		int count = 0;
		
		String[] words = sentance.trim().split(" ");
		
		
		for(int i = 0;i < words.length;i++) {
			count++;
		}
		System.out.println("Words in Sentance : " + count);
	}
}
