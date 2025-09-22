package assignments_3;

import java.util.Scanner;

public class TaxChecker_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();

        double tax = 0;
        double totalAmount = amount;

        if (amount <= 250000) {
            System.out.println("Amount : " + amount);
            System.out.println("No Tax : " + tax);
        } else if (amount > 250000 && amount <= 500000) {
            tax = amount * 0.05;
            totalAmount = amount + tax;
            System.out.println("Amount : " + amount);
            System.out.println("Tax : 5%");
        } else if (amount > 500000 && amount <= 1000000) {
            tax = amount * 0.20;
            totalAmount = amount + tax;
            System.out.println("Amount : " + amount);
            System.out.println("Tax : 20%");
        } else {
            tax = amount * 0.30;
            totalAmount = amount + tax;
            System.out.println("Amount : " + amount);
            System.out.println("Tax : 30%");
        }

        System.out.println("Tax Amount : " + tax);
        System.out.println("Total with Tax : " + totalAmount);
    }
}
