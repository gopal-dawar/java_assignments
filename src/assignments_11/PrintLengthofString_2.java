package assignments_11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PrintLengthofString_2 {
	public static void main(String[] args) {
		Function<String, Integer> num = (x) -> x.length();
		
		Supplier<String> name = () ->{
			return "Gopal";
		};
		Consumer<Integer> le = x -> System.out.println("Length : " + x);
		
		le.accept(num.apply(name.get()));
	}
}
