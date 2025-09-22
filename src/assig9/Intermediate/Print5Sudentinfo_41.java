package assig9.Intermediate;

public class Print5Sudentinfo_41 {
	public static void main(String[] args) {

		Student[] students = new Student[5];

		students[0] = new Student(11, "Gopal Dawar", 56.34f);
		students[1] = new Student(12, "shakharam Dawar", 66.64f);
		students[2] = new Student(13, "Chetan More", 89.56f);
		students[3] = new Student(23, "Nakul Pawar", 85.55f);
		students[4] = new Student(55, "Rohit Mali", 78.45f);

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}
}
