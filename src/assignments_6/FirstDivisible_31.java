package assignments_6;

public class FirstDivisible_31 {
	public static void main(String[] args) {
		int ramdom;

		do {
			ramdom = (int) (Math.random() * 1000) + 1;
			System.out.println(ramdom);
		} while (!(ramdom % 4 == 0 && ramdom % 6 == 0 && ramdom > 100));
		System.out.println(ramdom + " is divisible by 4 and 6");
	}
}
