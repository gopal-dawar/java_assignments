package assig8;

public class CountCase_5 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		int upperCaseCount = 0;
		int lowerCaseCount = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCaseCount++;
				} else {
					lowerCaseCount++;
				}
			}
		}
		System.out.println("UpperCase letter : " + upperCaseCount);
		System.out.println("LowerCase letter : " + lowerCaseCount);
	}
}
