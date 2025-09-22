package assig8;

public class CountVowels_1 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		int count = 0;
		for(int i = 0; i < name.length();i++) {
			if(name.charAt(i) == 'a' || name.charAt(i) == 'i' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i)== 'u' ) {
			count++;
			}
		}
		System.out.println("Vowels : " + count);
	}
}
