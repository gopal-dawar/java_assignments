package assig8;

public class CountConsonants_2 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.toLowerCase().charAt(i);
			if (Character.isLetter(ch)) {
				if (ch != 'a' && ch != 'i' && ch != 'e' && ch != 'o' && ch != 'u') {
					count++;
				}
			}
		}
		System.out.println("Consonants : " + count);
	}
}
