package assig9;

public class CheckShortAssendingOrder_27 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 33 };
		boolean b = false;

		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] > number[i + 1]) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println("Given Array not assending order");
		} else {
			System.out.println("Given Array is assending order");

		}
	}
}
