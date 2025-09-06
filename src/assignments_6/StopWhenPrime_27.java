package assignments_6;

import java.util.Scanner;

public class StopWhenPrime_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.print("Enter a number: ");
			num = sc.nextInt();

			boolean isPrime = true;
			if (num <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				System.out.println("Prime number entered: " + num);
				break; 
			} else {
				System.out.println(num + " is not prime. Try again.");
			}
		}

		sc.close();
	}

}
