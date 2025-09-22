package assig9.Intermediate;

public class Student {
	int id;
	String name;
	float marks;

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student id : " + id + "\nName : " + name + "\nMarks : " + marks + "\n";
	}

}
