package assig9;

public class FindSecondLargest_19 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 32, 23432, 2342, 7, 8, 9 };
		int max = number[0];
		int secondlarge = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				secondlarge = max;
				max = number[i];
			} else if (number[i] < max && number[i] > secondlarge) {
				secondlarge = number[i];
			}
		}

		System.out.println("Second large number : " + secondlarge);
	}
}
