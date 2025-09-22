package assig9;

import java.util.Scanner;

public class PrintGreaterNumber_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int input = sc.nextInt();

		int[] number = { 1, 2, 43, 4, 5, 5, 65, 43, 34, 12 };

		System.out.print("Greate numbers : ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] > input) {
				System.out.print(number[i] + " ");
			}
		}
	}
}
