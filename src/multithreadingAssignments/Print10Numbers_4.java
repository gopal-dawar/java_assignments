package multithreadingAssignments;

public class Print10Numbers_4 {
	public static void main(String[] args) {
		Test6 t1  = new Test6();
		t1.start();
	}
}

class Test6 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}