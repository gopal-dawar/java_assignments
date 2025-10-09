package assignments_12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertIntToString_16 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("using loop");
		List<String> string = new ArrayList<>();
		for (int n : number) {
			string.add(String.valueOf(n));
		}
		System.out.println(string.toString());

		System.out.println("Using stream");
		number.stream().map(x -> String.valueOf(x)).forEach(x -> System.out.print(x + " "));

	}

}
