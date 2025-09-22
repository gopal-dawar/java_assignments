package assig9;

public class MergeTwoArrayInThirdArray_13 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		int[] arr3 = new int[arr1.length + arr2.length];

		System.out.print("First Array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.print("Second Array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.print("Third Array : ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}
}
