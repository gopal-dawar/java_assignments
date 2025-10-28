package assignments_13.multithreadng;

public class ThreadJoin_4 {
	public static void main(String[] args) {
		Join1Thread j1 = new Join1Thread();
		Join2Thread j2 = new Join2Thread();

		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
		}
		j2.start();

	}
}

class Join1Thread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Hi this is the first thread");
		}
	}
}

class Join2Thread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Hi this is the Second thread");
		}
	}
}