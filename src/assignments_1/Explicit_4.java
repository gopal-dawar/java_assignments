package assignments_1;

public class Explicit_4 {
	public static void main(String[] args) {
		short s = 2342;
		byte b = (byte)s;
		System.out.println(b);
		
		char c = 'a';
		short s1 = (short)c;
		System.out.println(s1);
		
		int i = 23;
		char c1 = (char)i;
		System.out.println(c1);
		
		long l = 23412343l;
		int i2 = (int)l;
		System.out.println(i2);
		
		float f2 = 23423.3f;
		long l3 = (long)f2;
		System.out.println(l3);
		
		double d = 23423.3d;
		float f3 = (float)d;
	}
}
