package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;

public class UniqueWordsFromSentance_22 {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("I have 2 apples and 3 bananas.", "There are 5 students in the class.",
				"He bought 10 pens for 50 rupees.", "The train arrives in 15 minutes.",
				"We planted 7 trees in the garden.", "She scored 95 marks in math.",
				"They walked 4 kilometers yesterday.");

		String words = "";
		System.out.println("Normal way");
		for (String line : sentences) {
			String[] str = line.trim().split(" ");
			for (int i = 0; i < str.length; i++) {
				words = words + str[i] + " ";
			}
		}

		String[] str1 = words.trim().split(" ");
		boolean[] flage = new boolean[str1.length];
		for (int i = 0; i < str1.length; i++) {
			if (flage[i]) {
				continue;
			}
			for (int j = i + 1; j < str1.length; j++) {

				if (str1[i].equalsIgnoreCase(str1[j])) {
					flage[j] = true;
				}
			}
			if (!flage[i]) {
				System.out.println(str1[i]);
			}
		}
	}
}
