package assignments_13.multithreadng;

public class ThreadCommunication_7 {
	public static void main(String[] args) {
		Shared s = new Shared();

		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				s.put(i);
			}
		}).start();

		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				s.get();
			}
		}).start();
	}
}

class Shared {
	int num;
	boolean available = false;

	synchronized void put(int n) {
		while (available) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		num = n;
		System.out.println("Produced : " + n);
		available = true;
		notify();
	}

	synchronized void get() {
		while (!available) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Consumer : " + num);
		available = false;
		notify();
	}

}