package assig8;

public class RemoveSpaces_7 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		
		for(int i = 0; i < name.length();i++) {
			if (name.charAt(i) == ' ') {
				continue;
			}
			System.out.print(name.charAt(i));
		}
	}
}
