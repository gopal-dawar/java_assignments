package assignments_5;

import java.util.Scanner;

public class PrintTable_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.println(i * n);
			i++;
		}
		sc.close();
	}
}
