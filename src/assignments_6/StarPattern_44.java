package assignments_6;

import java.util.Scanner;

public class StarPattern_44 {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print("*");
				j++;
			} while (j <= i);
			
			System.out.println();
			i++;
		} while (i <= n);
	}
}
