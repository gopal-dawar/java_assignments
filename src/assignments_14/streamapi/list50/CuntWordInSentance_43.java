package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CuntWordInSentance_43 {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("I have 2 apples and 3 bananas.", "There are 5 students in the class.",
				"He bought 10 pens for 50 rupees.", "The train arrives in 15 minutes.",
				"We planted 7 trees in the garden.", "She scored 95 marks in math.",
				"They walked 4 kilometers yesterday.");

		Map<String, Long> coun = sentences.stream().map(x -> x.trim().split("\\W+")).flatMap(Arrays::stream)
				.map(String::toLowerCase).collect(Collectors.groupingBy(y -> y, Collectors.counting()));

		System.out.println(coun);
	}
}
