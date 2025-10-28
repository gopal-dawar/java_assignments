package assignments_13.multithreadng;

public class ThreadPriorityCheck_9 {
	public static void main(String[] args) {
		Prio1 p1 = new Prio1();
		Prio2 p2 = new Prio2();
		Prio3 p3 = new Prio3();

		p1.start();
		p2.start();
		p3.start();

	}

}

class Prio1 extends Thread {
	@Override

	public void run() {
		int max = Thread.currentThread().MAX_PRIORITY;
		System.out.println("Max thread : " + max);
	}
}

class Prio2 extends Thread {
	@Override
	public void run() {
		int min = Thread.currentThread().MIN_PRIORITY;
		System.out.println("Minimum thread : " + min);
	}
}

class Prio3 extends Thread {
	@Override
	public void run() {
		int normal = Thread.currentThread().NORM_PRIORITY;
		System.out.println("Normal thread : " + normal);
	}
}