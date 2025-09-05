package assignments_2;

import java.util.Scanner;

public class PrintIntegerValue_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 8 : ");
		PrintIntegerValue_8 a = new PrintIntegerValue_8();
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			System.out.println(a.printOne());
			break;
		}
		
		case 2: {
			System.out.println(a.printTwo());
			break;
		}
		case 3: {
		System.out.println(	a.printThree());
			break;
		}
		case 4: {
			System.out.println(a.printFout());
			break;
		}
		case 5: {
			System.out.println(a.printFive());
			break;
		}
		case 6: {
			System.out.println(a.printSix());
			break;
		}
		case 7: {
			System.out.println(a.printSeven());
			break;
		}
		case 8: {
			System.out.println(a.printEight());
			break;
		}
		default:
			System.out.println("Exit");
		}
		sc.close();

	}

	public String printOne() {
		return "One";
	}

	public String printTwo() {
		return "Two";
	}

	public String printThree() {
		return "Three";
	}

	public String printFout() {
		return "Four";
	}

	public String printFive() {
		return "Five";
	}

	public String printSix() {
		return "Six";
	}

	public String printSeven() {
		return "Seven";
	}

	public String printEight() {
		return "Eight";
	}
}
