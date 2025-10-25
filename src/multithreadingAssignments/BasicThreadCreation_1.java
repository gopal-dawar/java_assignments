package multithreadingAssignments;

public class BasicThreadCreation_1 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.start();
		
	}
}

class Test extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Gopal Dawar");
		}
	}
}