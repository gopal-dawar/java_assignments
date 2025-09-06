package assignments_5;

import java.util.Scanner;

public class CountDigit_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits : ");
		int digits = sc.nextInt();
		int count = 0;
		int i = 0;
		while (digits != 0) {
			int code = digits % 10;
			digits = digits / 10;
			count++;
			i++;

		}
		System.out.println("Count of digit : " + count);
	}
}
