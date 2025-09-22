package assig9;

public class NegetiveReplaceWithZero_25 {
	public static void main(String[] args) {
		int[] number = { -1, 2, -3, 4, 5, 6, -5, -6, -7, -8 };

		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				number[i] = 0;
			}
		}

		System.out.print("Without negetive array : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
