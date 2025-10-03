package assignments_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckElementExist_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it exist or not : ");
		int n = sc.nextInt();
		Set<Integer> num = new HashSet<>();

		num.add(7);
		num.add(8);
		num.add(2);
		num.add(3);		
		num.add(1);
		
		boolean b = false;		
		for(int n2 : num) {
			if (n2 == n) {
				b = true;
			}
		}

		if (b) {
			System.out.println(n + " is exist in set");
		}else {
			System.out.println("Not Found");
		}
	}
}
