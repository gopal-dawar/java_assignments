package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintPriceGretherThan100ONly_5 {
	public static void main(String[] args) {
		List<Double> price = Arrays.asList(10.10d, 1231.22d, 1232.221d, 1322133.23d, 32413.23d);

		for (double d : price) {
			if (d > 100) {
				System.out.println(d);
			}
		}
	}
}
