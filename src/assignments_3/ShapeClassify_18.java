package assignments_3;

import java.util.Scanner;

public class ShapeClassify_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side of triangle: ");
        int side1 = sc.nextInt();

        System.out.print("Enter second side of triangle: ");
        int side2 = sc.nextInt();

        System.out.print("Enter third side of triangle: ");
        int side3 = sc.nextInt();

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
