package functionalInterface11;

public class Ass2 {
	public static void main(String[] args) {
		Test2 t = (a,b) -> {
			System.out.println(a + b);
		};
		
		t.addTwoNumber(15, 5);
	}
}
