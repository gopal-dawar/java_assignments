package assig8;

public class ReplaceDigitwithAstrisk_12 {
	public static void main(String[] args) {
		String namewithDigit = "Gopal Dawar 2342";
		String newString = "";
		
		for(int i = 0; i < namewithDigit.length(); i++) {
			char ch = namewithDigit.charAt(i);
			
			if(Character.isDigit(ch)) {
				newString = newString + "#";
			}else {
				newString = newString + namewithDigit.charAt(i);
			}
		}
		System.out.println("New String : " + newString);
	}
}
