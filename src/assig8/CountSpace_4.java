package assig8;

public class CountSpace_4 {
	public static void main(String[] args) {
		String name = "Gopal Sairam Dawar";
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Spaces in String : " + count);
	}
}
