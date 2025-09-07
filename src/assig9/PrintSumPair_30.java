package assig9;

import java.util.Scanner;

public class PrintSumPair_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int input = sc.nextInt();

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == input) {
					System.out.println("Pair is :  " + numbers[i] + ", " + numbers[j]);
					
				}

			}
		}
	}
}
