package functionalInterface11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ass5 {
	public static void main(String[] args) {
		Test5 t1 = (s) -> {
			Collections.sort(s);
			System.out.println(s.toString());
		};
		
		List<String> names = Arrays.asList("Gopal","Sairam","Dawar");
		t1.printName(names);

	}
}
