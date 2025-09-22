package assignments_2;

public class SimpleInstrestParameter_2 {
	public static void main(String[] args) {
		SimpleInstrestParameter_2 obj1 = new SimpleInstrestParameter_2();
		obj1.printSimpleInstrest(40000, 2, 2);
		
		
	}

	public void printSimpleInstrest(int amount, int rate, int time) {
		double simpleInterest = (amount * rate * time) / 100;
		System.out.println("Simple instrest is : " + simpleInterest);
	}
	
}
