package assignments_6;

import java.util.Scanner;

public class NumberGuessGame_46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 5) + 1;
		int guess;
		System.out.println(random);

		System.out.println("Guess a number between 1 and 5: ");

		do {
			guess = sc.nextInt();

			if (guess != random) {
				System.out.println("Wrong guess! Try again: ");
			}

		} while (guess != random);

		System.out.println(random + " is matched! You guessed it right 🎉");

		sc.close();
	}
}
