package assignments_1;

public class Implicit_3 {
	public static void main(String[] args) {
		
		byte b = 20;
		short s = b;
		System.out.println(s);
		
		short s1 = 230;
		char c = (char)s1;
		System.out.println(c);
		
		char c1 = 'a';
		int i1 = c1;
		System.out.println(i1);
		
		int i2 = 23;
		long l1 = i2;
		System.out.println(l1);
		
		long l2 = 2312312l;
		float f1 = l2;
		System.out.println(f1);

		float f2 = 23423.234f;
		double d = f2;
		System.out.println(d);
		
	}
}
