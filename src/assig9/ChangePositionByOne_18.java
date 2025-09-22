package assig9;

public class ChangePositionByOne_18 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int last = number[number.length - 1];
		for (int i = number.length - 1; i > 0; i--) {
			number[i] = number[i - 1];
		}
		number[0] = last;

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
