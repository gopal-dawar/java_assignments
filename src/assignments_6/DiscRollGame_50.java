package assignments_6;

public class DiscRollGame_50 {
	public static void main(String[] args) {
		int dice;

		do {
			dice = (int) (Math.random() * 6) + 1; // generates 1 to 6
			System.out.println("Rolled: " + dice);
		} while (dice != 6);
		System.out.println("You rolled a 6! Game Over 🎲");
	}
}
