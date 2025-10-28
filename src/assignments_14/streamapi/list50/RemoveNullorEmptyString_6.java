package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class RemoveNullorEmptyString_6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("", "", "Gopal", "Dawar", "Mukesh", "", "");

		System.out.println("Normal Way");
		for (String str : list) {
			if (!str.isEmpty()) {
				System.out.println(str);
			}
		}

		System.out.println("Using Stream api");
		list.stream().filter(x -> !(x.isEmpty())).forEach(System.out::println);
	}
}
