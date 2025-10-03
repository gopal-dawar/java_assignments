package assignments_10;

import java.util.HashSet;
import java.util.Set;

public class PrintFruitNameUsingforenhancedLoop_12 {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("graps");
		fruits.add("Apple");
		
		
		for(String name : fruits) {
			System.out.println(name);
		}
	}
}	
