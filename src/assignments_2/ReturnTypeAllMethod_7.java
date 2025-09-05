package assignments_2;

public class ReturnTypeAllMethod_7 {
	public static void main(String[] args) {
		ReturnTypeAllMethod_7 r1 = new ReturnTypeAllMethod_7();
		r1.returnBoolean();
		r1.returnbyte();
		r1.returnChar();
		r1.returnDouble();
		r1.returnFloat();
		r1.returnInt();
		r1.returnLong();
		r1.returnShort();
	}

	public int returnInt() {
		System.out.println("Integer return");
		return 0;
	}

	public short returnShort() {
		System.out.println("Short return");
		return 0;
	}

	public byte returnbyte() {
		System.out.println("Byte return");
		return 0;
	}

	public long returnLong() {
		System.out.println("Long return");
		return 0;
	}

	public float returnFloat() {
		System.out.println("Float return");
		return 0;
	}

	public double returnDouble() {
		System.out.println("Double return");
		return 0;
	}

	public char returnChar() {
		System.out.println("Char return");
		return 'a';
	}
	
	private boolean returnBoolean() {
		System.out.println("Boolean return");
		return false;
	}

}
