package assignments_6;

public class SumRandomNumberUntil100_48 {
	public static void main(String[] args) {
		int random;
		int sum = 0;
		do {
			random = (int) (Math.random() * 100) + 1;
			if (sum + random <= 100) {
				sum = sum + random;
				System.out.println("Added : " + random + ", sum : " + sum);
			}
		} while (!(sum == 100));
		System.out.println("Exact Sum : " + sum);
	}
}
