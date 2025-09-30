package functionalInterface11;

public interface Ass1 {
	public static void main(String[] args) {
		Test t = () -> {
			System.out.println("Hi Gopal");
		};
		t.printName();
	}
}
