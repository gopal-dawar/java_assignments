package assignments_13.multithreadng;

public class DeamThread_8 {
	public static void main(String[] args) {
		Deaman d1 = new Deaman();
		Deaman d2 = new Deaman();
		d2.setDaemon(true);
		d1.start();
		d2.start();

	}
}

class Deaman extends Thread {
	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon Thread is running");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("User Define thread is running");
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		}
	}
}