package assig9;

public class ReverseOrderPrint_11 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
