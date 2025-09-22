package assig9;

public class FindMaxValueinArray_3 {
	public static void main(String[] args) {
		int[] intarray = { 1, 2, 3, 4, 65, 6, 7, 8, 9 };

		int max = intarray[0];
		for (int i = 0; i < intarray.length; i++) {
			if (intarray[i] > max) {
				max = intarray[i];
			}
		}

		System.out.println("Max value in array is : " + max);
	}
}
