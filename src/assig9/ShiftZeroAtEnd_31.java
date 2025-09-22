package assig9;

public class ShiftZeroAtEnd_31 {
	public static void main(String[] args) {
		int[] number = { 12, 3, 4, 5, 6, 7, 8, 0, 0, 8, 7, 6, 5, 4 };

		int index = 0;

		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] != 0) {
				number[index] = number[i];
				index++;
			}
		}

		while (index < number.length) {
			number[index] = 0;
			index++;
		}

		System.out.print("Shifted all zero at end : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}
}
