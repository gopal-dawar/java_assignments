package assignments_13.multithreadng;

public class DeadlockWorkInThread_10 {
	public static void main(String[] args) {
		Pen p = new Pen();
		NoteBook n = new NoteBook();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (p) {
					System.out.println("Thread 1 : for pen");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (n) {
						System.out.println("Thread 1 : for notebook");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (n) {
					System.out.println("Thread 2 : for notebook");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}

					synchronized (p) {
						System.out.println("Thread 2 : for pen");
					}
				}
			}
		};
		
		
		t1.start();
		t2.start();
		
	}
}

class Pen {
}

class NoteBook {
}