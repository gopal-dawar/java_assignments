package assignments_2;

public class ReturnRandomeNumber_10 {
	public static void main(String[] args) {
		ReturnRandomeNumber_10 r1 = new ReturnRandomeNumber_10();
		int randome = r1.returnRandomeValue();
		System.out.println("Randome value : " + randome);
	}
	
	private int returnRandomeValue() {
		int randome = (int) (Math.random() * 100 + 1);
		return randome; 
	}
}
