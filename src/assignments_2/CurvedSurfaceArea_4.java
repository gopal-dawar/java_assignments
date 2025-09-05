package assignments_2;

public class CurvedSurfaceArea_4 {
	void sphereCSA(double r) {
		double area = 4 * Math.PI * r * r;
		System.out.println("CSA of Sphere = " + area);
	}

	void cylinderCSA(double r, double h) {
		double area = 2 * Math.PI * r * h;
		System.out.println("CSA of Cylinder = " + area);
	}
	

	void cubeCSA(double a) {
		double area = 4 * a * a;
		System.out.println("CSA of Cube = " + area);
	}

	void cuboidCSA(double l, double b, double h) {
		double area = 2 * h * (l + b);
		System.out.println("CSA of Cuboid = " + area);
	}

	public static void main(String[] args) {
		CurvedSurfaceArea_4 obj = new CurvedSurfaceArea_4();

		obj.sphereCSA(7);
		obj.cylinderCSA(5, 10);
		obj.cubeCSA(6);
		obj.cuboidCSA(4, 3, 5);
	}

}
