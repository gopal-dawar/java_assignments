package assig8;

public class ReverseString_6 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		
		for(int i = name.length()-1; i >= 0;i--) {
			System.out.print(name.charAt(i));
		}
	}
}
