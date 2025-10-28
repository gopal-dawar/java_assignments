package assignments_14.streamapi.list50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringlengthList_21 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Papaya", "Cherry", "Banana", "Strawberry", "Apple", "Kiwi", "Orange",
				"Mango", "Pineapple", "Grapes");

		System.out.println("Normal way");
		List<Integer> lenlist = new ArrayList<Integer>();
		for (String str : list) {
			lenlist.add(str.length());
		}
		System.out.println(lenlist.toString());

		System.out.println("Using Stream api");
		List<Integer> lenlist1 = list.stream().map(x -> x.length()).collect(Collectors.toList());

		System.out.println(lenlist1.toString());
	}
}
