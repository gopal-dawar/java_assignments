package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageinList_23 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(42, 17, 89, 3, 76, 58, 24, 91, 6, 33, 70, 12, 65, 99, 8, 47, 29, 84, 19, 53,
				42, 99, 17, 6, 84);

		System.out.println("Normal way");
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total = total + list.get(i);
		}

		int avrage = total / list.size();

		System.out.println("Average : " + avrage);

		System.out.println("Using stream api");
		OptionalDouble d = list.stream().mapToInt(x -> x).average();
		System.out.println(d.getAsDouble());
	}
}
