package assignments_2;

public class CalculateArea_3 {
	public static void main(String[] args) {
		CalculateArea_3  c1 = new CalculateArea_3();
		c1.printAreaofCircle(32);
		c1.printAreaOfRhombus(12, 12);
		c1.printReactangleArea(20, 20);
		c1.printSquare(5);
	}
	
	public void printSquare(int n) {
		int sq = n * n;
		System.out.println("Square is : " + sq);
	}
	
	public void printReactangleArea(int length, int width) {
		int area = length * width;
		System.out.println("Area of Reactangle : " + area);
	}
	
	public void printAreaofCircle(float r) {
		float pi = 3.141595f;
		float area = pi * r * r;
		System.out.println("Area of circle : " + area);
	}
	
	public void printAreaOfRhombus(int d1, int d2) {
		int area = (d1 * d2)/2;
		System.out.println("Area of Rhombus : " + area);
	}
	
}
