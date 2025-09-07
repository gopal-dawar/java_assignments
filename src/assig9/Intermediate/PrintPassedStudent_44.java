package assig9.Intermediate;

public class PrintPassedStudent_44 {
	public static void main(String[] args) {
		Student[] students = new Student[10];

		int count = 0;
		students[0] = new Student(11, "Gopal Dawar", 56.34f);
		students[1] = new Student(12, "Shakharam Dawar", 66.64f);
		students[2] = new Student(13, "Chetan More", 89.56f);
		students[3] = new Student(23, "Nakul Pawar", 35.50f);
		students[4] = new Student(55, "Rohit Mali", 78.45f);
		students[5] = new Student(32, "Sneha Patil", 20.00f);
		students[6] = new Student(45, "Aniket Jadhav", 73.50f);
		students[7] = new Student(67, "Pooja Shinde", 38.10f);
		students[8] = new Student(78, "Vikas Chavan", 64.75f);
		students[9] = new Student(90, "Komal Pawar", 82.30f);

		for (int i = 0; i < students.length; i++) {
			if (students[i].marks >= 40) {
				count++;
			}
		}

		System.out.println(count + " student are passed");

	}

}
