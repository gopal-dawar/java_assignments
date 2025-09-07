package assig9;

public class ReplaceProduct_29 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		int product = 1;

		for (int i = 0; i < numbers.length; i++) {
			product = product * numbers[i];
		}

		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			result[i] = product / numbers[i];
		}

		System.out.print("Producted Array : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}
