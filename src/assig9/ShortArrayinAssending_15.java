package assig9;

import java.util.Arrays;

public class ShortArrayinAssending_15 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 3, 8, 4 };

		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
