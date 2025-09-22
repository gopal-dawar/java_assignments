package assignments_2;

public class SquareandCube_5 {
	int n;
	public SquareandCube_5(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		SquareandCube_5 s = new SquareandCube_5(5);
		System.out.println("Squar is : " + s.n * s.n);
		System.out.println("Cube is : " + s.n * s.n * s.n);
	}
}
