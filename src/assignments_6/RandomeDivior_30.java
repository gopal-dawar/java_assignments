package assignments_6;

public class RandomeDivior_30 {
	public static void main(String[] args) {
		int random;
		do {
			random = (int) (Math.random() * 100) + 1;
			System.out.println(random);
		} while (!(random % 7 == 0));
		System.out.println(random + " is divisible by 7!");
	}
}
