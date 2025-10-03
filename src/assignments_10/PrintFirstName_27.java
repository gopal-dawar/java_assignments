package assignments_10;

import java.util.Arrays;
import java.util.List;

public class PrintFirstName_27 {
	public static void main(String[] args) {
		List<String> fullName = Arrays.asList("Gopal Dawar", "Rahul Sharma", "Sneha Patil", "Amit Verma", "Priya Singh",
				"Vikas Yadav");

		System.out.print("First name only : ");
		for (String nm : fullName) {
			String[] firstName = nm.trim().split(" ");
			System.out.print(firstName[0] + ", ");
		}
	}
}
