package assignments_6;

public class SumUntilSingleDigit_34 {
	public static void main(String[] args) {
		int random;
		int sum = 0;
		
		do {
			random  = (int)(Math.random()*1000) + 1;
			sum = sum + random;
		} while (!(random <= 9));
		System.out.println("Sum of all number Until single : " + sum);
	}
}
