package assig9;

import java.util.Scanner;

public class CountHowManyTimeAppear_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int input = sc.nextInt();

		int[] numbers = { 1, 2, 3, 4, 4, 3, 4, 5, 6, 6, 32, 44 };
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				count++;
			}
		}
		System.out.println(input + " is appears " + count + " time");

	}
}
