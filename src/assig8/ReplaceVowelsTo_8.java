package assig8;

public class ReplaceVowelsTo_8 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		String replaced = "";
		for(int i = 0; i < name.length();i++) {
			
			if (name.charAt(i) == 'a' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'e') {
				replaced = replaced + "*";
			}else {
				replaced = replaced + name.charAt(i);
			}
		}
		System.out.println("Replaced String : " + replaced);
	}
}
