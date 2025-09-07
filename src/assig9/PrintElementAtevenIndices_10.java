package assig9;

public class PrintElementAtevenIndices_10 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] evenindices = new int[numbers.length];

		System.out.print("Indices of even position number : ");
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}

	}
}
