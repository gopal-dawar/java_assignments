package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintWichisStartA_2 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Gopal", "Aawinash", "Ajay", "Nakul", "Chetan");
		for(String names: name) {
			if(names.startsWith("A")) {
				System.out.println(names);
			}
		}
	}
}
