package assignments_13.multithreadng;

public class ThreadImplementation_2 {
	public static void main(String[] args) {
		Thread2 t = new Thread2();
		Thread t1 = new Thread(t);
		t1.start();
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * i);
		}
	}

}