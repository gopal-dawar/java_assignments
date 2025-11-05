package assignments_14.streamapi.set50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q50 {
	public static void main(String[] args) {
		Set<String> path = new HashSet<String>(Arrays.asList("C:/Files/photo.jpg", "D:/Docs/report.pdf",
				"/home/user/data.csv", "C:/Projects/main.java", "test.JPG", "backup.tar.gz"));

		path.stream().map(x -> x.substring(x.lastIndexOf('.') + 1)).map(String::toLowerCase).distinct()
				.forEach(System.out::println);

	}
}
