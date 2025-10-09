package assignments_12.streamdemoassignment;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;

public class StreamDemo_1 {
	public static void main(String[] args) {
//		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		===============================================
//		print even 
//		normal way
//		for (int n : number) {
//			if (n % 2 == 0) {
//				System.out.println(n);
//			}
//		}
//		using api
//		number.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
//		================================================

//		count even number 
//		int count = 0;
//		for(int n : number) {
//			if (n % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//		Long count = number.stream().filter(x -> x % 2 == 0).count();
//		System.out.println(count);
//		====================================================
//		collection to stream 
//		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> stream = l2.stream();
//		stream.forEach(x -> System.out.println(x));
//		=================================================

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		IntStream arrstream = Arrays.stream(arr);
//		=====================================

//		===================================================
//		Stream with all data types 

//		Stream<Integer> i = Stream.of(1, 2, 3, 4, 5, 6);
//		Stream<Byte> b = Stream.of((byte) 1, ( ) 2, (byte) 3, (byte) 4);
//		Stream<Short> s = Stream.of((short) 1, (short) 2, (short) 3, (short) 4);
//		Stream<Long> l = Stream.of(1l, 2l, 3l, 4l, 5l);
//		Stream<Float> f = Stream.of(123.3f, 23.234f);
//		Stream<Double> d = Stream.of(1.0, 212.12, 1233.2, 4.123, 5.234);
//		Stream<Boolean> b = Stream.of(true, false,true,false);
//		Stream<Character> c = Stream.of('a', 'b', 'c', 'd', 'e');

//		===========================================================
//		Data type to stream conversion
//		Integer to stream conversion
//
//		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
//		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
//		Stream<Integer> intarr = Arrays.stream(arr);
//		intarr.forEach(x -> System.out.println(x));

//		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
//		Stream intarr = Arrays.stream(arr);
//
//		String[] n = { "gopal", "Dawar" };
//		Stream sarr = Arrays.stream(n);
//
//		intarr.forEach(x -> System.out.println(x));
//		sarr.forEach(x -> System.out.println(x));
//		int[] n = { 1, 2, 3, 4, 5 };
//		Stream<Integer> n1 = Arrays.stream(n);
//		IntStream n2 = Arrays.stream(n);
//
//		===================================================
//		Normaly list to stream

//		List<Integer> l1 = new LinkedList<>();
//		l1.add(1);
//		l1.add(2);
//		l1.add(3);
//		l1.add(4);
//		l1.add(2);
//
//		Stream<Integer> i = l1.stream();
//
//		List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> i2 = l2.stream();
//
//		List l3 = new LinkedList<>();
//		l3.add(5);
//		l3.add(6);
//		l3.add(7);
//		l3.add(8);
//		l3.add(9);
//		l3.add(5);
//		Stream<Integer> i3 = l3.stream();
//
//		List l4 = Arrays.asList(6, 7, 8, 9, 10);
//		Stream<Integer> i4 = l4.stream();
//
//		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);
//		s1.forEach(System.out::println);
//		=================================================
//		infinite Stream
//		Stream.generate(() -> 1).forEach(System.out::println);
//		Stream.iterate(1, x -> x + 1).forEach(System.out::println);

//		Stream<Integer> even = Stream.iterate(0, x -> x + 2);
//		even.forEach(x -> System.out.print(x + " "));

//		Stream.iterate(1, a -> a >= 0, b -> b + 1).forEach(System.out::println);

//		Stream.generate(Math::random).forEach(System.out::println);
	}
}
