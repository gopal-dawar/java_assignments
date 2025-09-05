package assignments_1;

import java.util.Scanner;

public class FehrenheittoCelsius_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit : ");
		double fahrenheit = sc.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println("Celsius : " + celsius);
	}
}
