package assig9;

public class CountDuplicate_32 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 9, 9 };

		int count = 0;

		for (int i = 0; i < number.length; i++) {
			boolean duplicate = false;

			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					duplicate = true;
					break;
				}
			}

			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (number[i] == number[k]) {
					alreadyCounted = true;
					break;
				}
			}

			if (duplicate && !alreadyCounted) {
				count++;
			}
		}

		System.out.println("Distinct duplicate numbers count: " + count);
	}
}
