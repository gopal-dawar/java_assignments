package assig9;

import java.util.Scanner;

public class PrintStudentPassFail_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("Enter how many subject to check you fail or pass : ");
		int size = sc.nextInt();

		float[] marks = new float[size];
		System.out.println("Enter subject marks : ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextFloat();
		}

		System.out.println("Name : " + name);
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 40 && marks[i] <= 100) {
				System.out.println(i + 1 + ". Marks : " + marks[i] + " -> Pass");
			} else if (marks[i] > 100) {
				System.out.println(i + 1 + ". You Entered Invalid Marks");
			} else {
				System.out.println(i + 1 + ". Marks : " + marks[i] + " -> Fail");
			}
		}
	}
}
