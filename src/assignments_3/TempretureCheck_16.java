package assignments_3;

import java.util.Scanner;

public class TempretureCheck_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature value: ");
		double temp = sc.nextDouble();

		System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
		char unit = sc.next().charAt(0);

		if (unit == 'C' || unit == 'c') {
			double fahrenheit = (temp * 9 / 5) + 32;
			System.out.println(temp + "°C = " + fahrenheit + "°F");
		} else if (unit == 'F' || unit == 'f') {
			double celsius = (temp - 32) * 5 / 9;
			System.out.println(temp + "°F = " + celsius + "°C");
		} else {
			System.out.println("Invalid unit entered! Please enter C or F.");
		}
	}
}
