package assig9;

public class PrintDifferenceBetweenSmallAndLarge_24 {
	public static void main(String[] args) {
		int[] numbers = { 2, 111, 3, 45, 5, 6, 76 };

		int large = numbers[0];
		int small = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > large) {
				large = numbers[i];
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < small) {
				small = numbers[i];
			}
		}

		int differenc = large - small;
		System.out.println("Difference between small and large : " + Math.abs(differenc));
	}
}
