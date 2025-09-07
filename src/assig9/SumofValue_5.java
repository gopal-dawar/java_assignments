package assig9;

public class SumofValue_5 {
	public static void main(String[] args) {
		int[] intarray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;
		for (int i = 0; i < intarray.length; i++) {
			sum = sum + intarray[i];
		}

		System.out.println("sum of value in given array : " + sum);
	}
}
