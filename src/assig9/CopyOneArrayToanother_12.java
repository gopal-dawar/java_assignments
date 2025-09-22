package assig9;

public class CopyOneArrayToanother_12 {
	public static void main(String[] args) {
		int[] arr1 = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; 
		}

		System.out.print("Array First : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Array Second : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
