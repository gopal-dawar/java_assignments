package assignments_12.streamdemoassignment;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo_2 {
	public static void main(String[] args) {

//		print string which is start from 'G'
//		List<String> list = Arrays.asList("Akshit", "Ram", "Ganesh", "Shyam", "Ghanshyam", "Aakesh", "Gopal");
//		list.stream().filter(x -> x.startsWith("G")).forEach(System.out::println);
//
//		count string which start from 'G'
//		Long count1 = list.stream().filter(x -> x.startsWith("G")).count();
//		System.out.println(count1);
//
//		String count 
//		Long count2 = list.stream().count();
//		System.out.println(count2);

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		for (int n : list) {
//			if (n % 2 == 0 && n > 2 && n < 6) {
//				System.out.println(n);
//			}
//		}

//		1. filter		
//		list.stream().filter(x -> x % 2 == 0 && x > 2 && x < 6).forEach(x -> System.out.println(x));

//		2. map
//		list.stream().map(x -> x % 2 == 0 && x > 2 && x < 6).forEach(x -> System.out.println(x));

//		3. sorted
//		List<Integer> list = Arrays.asList(7, 8, 2, 3, 1, 1, 2, 3, 4, 4);
//		Stream<Integer> a = list.stream().sorted();

//		4. distinct 
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 11, 2, 3, 44, 55, 5);
//		list.stream().distinct().forEach(System.out::println);

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 11, 2, 3, 44, 55, 5);
//		Long l = list.stream().limit(10).skip(5).peek(System.out::println).count();
//		System.out.println(l);

// 		5. peek
//		list.stream().limit(5).peek(x -> System.out.println(x * 2)).collect(Collectors.toList());

//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//		l1.stream().peek(x -> System.out.println("Before filter : " + x)).filter(x -> x % 2 == 0)
//				.forEach(System.out::println);

//		6. flatMap -> 

//		Example 
//		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8));
//		System.out.println(list1.get(0).get(3));
//
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9));

		list.stream().skip(1).flatMap(x -> x.stream().filter(y -> y % 2 == 0)).forEach(System.out::println);

	}
}
