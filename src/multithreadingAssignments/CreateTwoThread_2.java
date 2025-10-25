package multithreadingAssignments;

public class CreateTwoThread_2 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		t1.start();
		t2.start();
	}
}

class Test1 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello Gopal");
	}
}

class Test2 extends Thread {
	@Override
	public void run() {
		System.out.println("Hi Gopal");
	}
}