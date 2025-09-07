package assig9;

public class CountOddEven_7 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int odd = 0;
		int even = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Evens in given array : " + even);
		System.out.println("Odds in given array : " + odd);

	}
}
