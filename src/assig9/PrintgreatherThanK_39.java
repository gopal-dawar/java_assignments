package assig9;

import java.util.Scanner;

public class PrintgreatherThanK_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();

		char[] charArray = new char[size];

		System.out.println("Enter alphabets : ");

		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = sc.next().charAt(0);
		}

		System.out.println("Enter alphabets to check how many greater than alphabet : ");
		char ch = sc.next().charAt(0);

		System.out.print("Greater than " + ch + " alphabets is : ");
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] > ch) {
				System.out.print(charArray[i] + " ");
			}
		}
	}
}
