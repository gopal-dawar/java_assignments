package multithreadingAssignments;

public class PrintThreadName_6 {
	public static void main(String[] args) {
		Test9 t1 = new Test9();
		t1.start();
	}
}

class Test9 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}