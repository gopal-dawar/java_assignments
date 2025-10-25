package multithreadingAssignments;

public class CreateThreeThreads_3 {
	public static void main(String[] args) {
		Test3 t1 = new Test3();
		Test4 t2 = new Test4();
		Test5 t3 = new Test5();
		t1.start();
		t2.start();
		t3.start();
	}
}

class Test3 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("First Thread");
	}
}

class Test4 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Second Thread");
	}
}

class Test5 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Third Thread");
	}
}