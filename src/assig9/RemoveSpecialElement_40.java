package assig9;

public class RemoveSpecialElement_40 {
	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 8, 9, 10, 1, 2 };
		int[] numbers2 = new int[numbers1.length];
		int a = 0;
		for (int i = 0; i < numbers1.length; i++) {
			for (int j = i + 1; j < numbers1.length; j++) {
				if (numbers1[i] == numbers1[j]) {

					boolean b = false;

					for (int k = 0; k < a; k++) {
						if (numbers2[k] == numbers1[i]) {
							b = true;
							break;
						}
					}

					if (!b) {
						numbers2[a] = numbers1[i];
						a++;

					}
				}
			}
		}
		System.out.println();
		System.out.print("Special Elements are : ");
		for (int i = 0; i < a; i++) {
			System.out.print(numbers2[i] + " ");
		}

	}
}
