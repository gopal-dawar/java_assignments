package assig9;

public class ReverseOnlyEven_36 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 78, 44 };

		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				count++;
			}
		}

		int a = 0;
		int[] even = new int[count];
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				even[a++] = number[i];
			}
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = even.length - 1; j >= 0; j--) {
				if (number[i] % 2 == 0) {
					number[i] = even[j];
				}
			}
		}

		for (int i = 0; i < even.length; i++) {
			System.out.println(number[i]);
		}
	}
}
