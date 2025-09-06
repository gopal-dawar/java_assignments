package assignments_6;

public class PrintOddNumber_4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);
	}
}
