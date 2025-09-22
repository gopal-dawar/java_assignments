package assig9;

import java.util.Scanner;

public class PrintGrade_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter 10 subject marks : ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= 90) {
				System.out.println("A Grade");
			} else if (numbers[i] >= 80) {
				System.out.println("B Grade");
			} else if (numbers[i] >= 70) {
				System.out.println("C Grade");
			} else if (numbers[i] >= 60) {
				System.out.println("D Grade");
			} else {
				System.out.println("Fail");
			}
		}
	}
}
