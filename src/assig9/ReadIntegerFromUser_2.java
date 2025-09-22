package assig9;

import java.util.Scanner;

public class ReadIntegerFromUser_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] intarray = new int[size];

		System.out.println("Enter five array : ");
		for (int i = 0; i <= size; i++) {
			intarray[i] = sc.nextInt();
			System.out.println(intarray[i]);
		}

	}

}
