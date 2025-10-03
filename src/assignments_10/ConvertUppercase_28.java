package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class ConvertUppercase_28 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");

		Set<String> conColors = new HashSet<>();

		for (String cl : colors) {
			conColors.add(cl.toUpperCase());
		}
		
		System.out.println("First : " + colors.toString());
		System.out.println("Second : " + conColors.toString());

	}
}
