package assignments_6;

public class FlipCointGame2_47 {
	public static void main(String[] args) {
		int random;
		int count = 0;
		do {
			random = (int) (Math.random() * 3) + 1;
			if (random == 1) {
				System.out.println("Head!");
				count++;
			}else if (random == 2) {
				System.out.println("Tell");
			}else {
				System.out.println("Flip Coin");
			}
		} while (!(count == 3));
	}
}
