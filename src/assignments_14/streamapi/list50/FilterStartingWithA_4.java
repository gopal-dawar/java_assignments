package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class FilterStartingWithA_4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Aakesh", "Gopal", "Dawar", "Rajesh");

		System.out.println("Normal way");
		for (String str : list) {
			if (str.startsWith("A")) {
				System.out.println(str);
			}
		}

		System.out.println("Using stream api");
		list.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
	}
}
