package assig9;

public class RemovDuplicate_14 {
	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9 };
		int[] n2 = new int[n1.length];
		int a = 0;

		for (int i = 0; i < n1.length; i++) {

			boolean d = false;

			for (int k = 0; k < a; k++) {
				if (n1[i] == n2[k]) {
					d = true;
					break;
				}
			}

			if (!d) {
				n2[a] = n1[i];
				a++;
			}
		}

		System.out.print("Array without duplicates:");

		for (int i = 0; i < a; i++) {
			System.out.print(n2[i] + " ");
		}
	}
}
