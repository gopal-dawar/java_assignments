package functionalInterface11;

public class Ass3 {
	public static void main(String[] args) {
		Test3 t = (s) -> {
			System.out.println(s.toUpperCase());
		};
		t.process("Gopal");
		
		Test3 t2 = (s) -> {
			System.out.println(s.length());
		};
		t2.process("Sairam");
		
		Test3 t3 = (s) -> {
			String reverse = "";
			for(int i = s.length() - 1;i>=0;i--) {
				char ch = s.charAt(i);
				reverse = reverse + ch;
			}
			System.out.println(reverse);
		};
		
		t3.process("Dawar");
		
	}
	
}
