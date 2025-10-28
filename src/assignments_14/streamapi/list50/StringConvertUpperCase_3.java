package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class StringConvertUpperCase_3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Gopal", "Dawar", "Mukesh");
		
		System.out.println("Noraml Ways");
		for(String str: list) {
			System.out.println(str.toUpperCase());
		}
		
		System.out.println("Using Stream api");
		
		list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
	}
}
