package assignments_13.multithreadng;

public class Createthreadbyextending_1 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
	}
}

class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}