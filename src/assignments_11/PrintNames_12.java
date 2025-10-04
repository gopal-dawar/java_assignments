package assignments_11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PrintNames_12 {
	public static void main(String[] args) {
		Supplier<List<String>> list = () -> {
			List<String> li = Arrays.asList("Gopal", "Dawar", "Sairam");
			return li;
		};

		Consumer<List<String>> print = x -> {
			for (String nm : x) {
				System.out.println(nm);
			}
		};
		
		print.accept(list.get());

	}
}
