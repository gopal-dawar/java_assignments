package assig9;

public class PrintCommonElement_23 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 10 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Common Elements in both array : ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					System.out.print(arr2[i] + " ");
				}
			}
		}

	}
}
