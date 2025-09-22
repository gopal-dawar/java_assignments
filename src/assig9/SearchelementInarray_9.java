package assig9;

import java.util.Scanner;

public class SearchelementInarray_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Find elements in array : ");
		int findedelement = sc.nextInt();

		boolean b = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == findedelement) {
				b = true;
				break;
			}
		}

		if (b) {
			System.out.println("Element exist in array : " + findedelement);
		} else {
			System.out.println("Element not exist in array : " + findedelement);
		}
	}
}
