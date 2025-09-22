package assignments_6;

import java.util.Scanner;

public class NumberLock_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter 4-digit password: ");
            n = sc.nextInt();

            int temp = n;
            int count = 0;

            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            if (count == 4) {
                System.out.println("Password accepted: " + n);
                break;
            } else {
                System.out.println("Invalid! Please enter a 4-digit number.");
            }

        } while (true);

        sc.close();
    }
}
