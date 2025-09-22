package assig9.Intermediate;

import java.util.Scanner;

public class TakeStudentInfoStorInArrayObject_46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many students : ");
		int size = sc.nextInt();
		sc.nextLine();

		Student[] students = new Student[size];

		for (int i = 0; i < students.length; i++) {
			int count = i + 1;
			System.out.println("Enter " + count + " students  marks!");
			System.out.print("Enter Name : ");
			String name = sc.nextLine();

			System.out.print("Enter id : ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter marks : ");
			float marks = sc.nextFloat();
			sc.nextLine();

			System.out.println();
			students[i] = new Student(id, name, marks);
		}

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}
}
