package assignments_6;

public class TrianglePattern_45 {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		
		do {
			int j = 1;
			do {
				System.out.print(i + " ");
				j++;
			} while (j <= i);
			System.out.println();
			i++;
		} while (i <= n);
	}
}
