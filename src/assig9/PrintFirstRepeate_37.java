package assig9;

public class PrintFirstRepeate_37 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 7, 9 };

		System.out.print("First Repeated Number is : ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] == number[i + 1]) {
				System.out.print(number[i]);
				break;
			}
		}
	}
}
