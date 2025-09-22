package assig8;

public class CountDigits_3 {
	public static void main(String[] args) {
		String name = "Gopal Dawar 123456765432";
		
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			if(Character.isDigit(name.charAt(i))) {
				count++;
			}
		}
		System.out.println("Digits in String : " + count);
	}
}
