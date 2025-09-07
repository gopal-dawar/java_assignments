package assig9;

import java.util.Iterator;

public class CountEvenOddInOtherArray_33 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int evensize = 0;
		int oddsize = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evensize++;
			} else {
				oddsize++;
			}
		}

		int[] arr1 = new int[evensize];
		int[] arr2 = new int[oddsize];

		int e = 0;
		int o = 0;

		System.out.print("First array : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			if (numbers[i] % 2 == 0) {
				arr1[e++] = numbers[i];
			} else {
				arr2[o++] = numbers[i];
			}
		}

		System.out.println();

		System.out.print("Even array : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Odd array : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
