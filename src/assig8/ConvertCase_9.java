package assig8;

public class ConvertCase_9 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";
		String casename = "";
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				casename = casename + Character.toLowerCase(ch);
			}else {
				casename = casename + Character.toUpperCase(ch);
			}
		}
		System.out.println("New String : " + casename);
	}
}
