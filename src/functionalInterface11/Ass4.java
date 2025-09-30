package functionalInterface11;

public class Ass4 {
	public static void main(String[] args) {
		Test4 t1 = (s) -> {
			System.out.println(s * s);
		};
		t1.calculate(5);
	}
}
