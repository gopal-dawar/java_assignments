package assig9;

public class SwapFirstLast_17 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Without swap array : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		int temp = number[0];
		number[0] = number[number.length - 1];
		number[number.length - 1] = temp;

		System.out.println();
		System.out.print("Swap array : ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}
}
