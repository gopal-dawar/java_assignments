package assig8;

public class RemoveDuplicate_18 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		String newString = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if (newString.indexOf(ch) == -1) {
				newString = newString + ch;
			}

		}
		System.out.println("Original : " + name);
		System.out.println("New String : " + newString);
	}
}
