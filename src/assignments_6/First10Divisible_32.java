package assignments_6;

public class First10Divisible_32 {
	public static void main(String[] args) {
		int random;
		int count = 0;
		do {
			random = (int)(Math.random()*100) + 1;
			if (random % 9 == 0) {
				System.out.println(random);
				count++;				
			}
		} while (count != 10);
	}
}
