package assignments_3;

import java.util.Scanner;

public class ValidTriangle_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side : ");
		int side1 = sc.nextInt();
		
		System.out.println("Enter second side : ");
		int side2 = sc.nextInt();
		
		System.out.println("Enter third side : ");
		int side3 = sc.nextInt();
		
		int sum = 0;
		if (side1 > 0 && side2 > 0 && side3 > 0) {
			sum = side1 + side2 + side3;
			System.out.println(sum);
			if(sum >= 180) {
				System.out.println("Valid Triangle");
			}else {
				System.out.println("sum not equal to 180");
			}
		}else {
			System.out.println("Value are not valid");
		}
	}
}
