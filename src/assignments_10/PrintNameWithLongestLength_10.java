package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintNameWithLongestLength_10 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Gopal", "Dawar", "Sairam");
		String largeName = names.get(0);

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).length() > largeName.length()) {
				largeName = names.get(i);
			}
		}
		
		System.out.println("Longest String is : " + largeName);
		System.out.println("Length is : " + largeName.length());
		
	}
}
