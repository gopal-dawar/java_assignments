package assignments_6;

import java.util.Scanner;

public class EnterGreaterThen100_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i = 0;
		do {
			System.out.println("Enter number : ");
			n = sc.nextInt();
			i++;
		} while (!(n >= 101));
		System.out.println("Finally you entered greter then 100!");
	}
}
