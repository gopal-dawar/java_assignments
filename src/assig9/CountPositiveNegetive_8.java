package assig9;

public class CountPositiveNegetive_8 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6, -7, -8, -9 };

		int negetive = 0;
		int positive = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				negetive++;
			} else {
				positive++;
			}
		}

		System.out.println("Negetive Numbers : " + negetive);
		System.out.println("Positive Numbers : " + positive);
	}
}
