package assig8;

public class NonRepeat_17 {
	public static void main(String[] args) {
		String name = "Gopal Dawar";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 0;

			if (ch == ' ') {
				continue;
			}

			for (int j = 0; j < name.length(); j++) {
				if (name.charAt(j) == ch) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(ch + "=" + count);
			}
		}
	}
}
