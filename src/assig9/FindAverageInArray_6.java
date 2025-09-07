package assig9;

public class FindAverageInArray_6 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		float average = 0;

		for (int i = 0; i < numbers.length; i++) {
			average = average + numbers[i];
		}

		float total = average / numbers.length;
		System.out.println("Average value in array : " + total);

	}
}
