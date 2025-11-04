package assignments_12.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EelistandLatesDate_49 {
	public static void main(String[] args) {
		List<LocalDate> dates = Arrays.asList(LocalDate.of(2025, 11, 04), LocalDate.of(2025, 11, 03),
				LocalDate.of(2025, 11, 02), LocalDate.of(2025, 11, 01), LocalDate.of(2025, 10, 31),
				LocalDate.of(2025, 10, 30), LocalDate.of(2025, 10, 29), LocalDate.of(2025, 10, 28),
				LocalDate.of(2025, 10, 27), LocalDate.of(2025, 10, 26));

		LocalDate max = dates.stream().max(Comparator.naturalOrder()).orElse(null);
		LocalDate min = dates.stream().min(Comparator.naturalOrder()).orElse(null);

		System.out.println(max);
		System.out.println(min);
	}
}
