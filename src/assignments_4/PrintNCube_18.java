package assignments_4;

import java.util.Scanner;

public class PrintNCube_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbre : ");
		int n = sc.nextInt();
		int cube = 1;

		for (int i = 1; i <= n; i++) {
			cube = i * i * i;
			System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
		}
	}
}
