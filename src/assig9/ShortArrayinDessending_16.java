package assig9;

import java.util.Arrays;
import java.util.Collections;

public class ShortArrayinDessending_16 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 3, 8, 4 };

		Arrays.sort(numbers);

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
