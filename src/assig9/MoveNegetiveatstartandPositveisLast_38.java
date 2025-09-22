package assig9;

public class MoveNegetiveatstartandPositveisLast_38 {
	public static void main(String[] args) {
		int[] number = { -10, -11, -44, 1, 2, 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6, -5, -4, -3, -2, -1 };

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				count1++;
			} else {
				count2++;
			}
		}

		int[] negative = new int[count1];
		int[] positive = new int[count2];

		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				negative[index1] = number[i];
				index1++;
			} else if (number[i] > 0) {
				positive[index2] = number[i];
				index2++;
			}
		}

		for (int i = 0; i < negative.length; i++) {
			number[i] = negative[i];
		}

		for (int i = 0; i < positive.length; i++) {
			number[i + negative.length] = positive[i];
		}

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
