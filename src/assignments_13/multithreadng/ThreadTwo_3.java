package assignments_13.multithreadng;

public class ThreadTwo_3 {
	public static void main(String[] args) {
		EvenNumberThread e = new EvenNumberThread();
		OddNumberThread o = new OddNumberThread();
		e.start();
		o.start();
	}
}

class EvenNumberThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class OddNumberThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}