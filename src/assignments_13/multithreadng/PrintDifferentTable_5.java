package assignments_13.multithreadng;

public class PrintDifferentTable_5 {
	public static void main(String[] args) {
		Printer p1 = new Printer();

		Table t1 = new Table(p1, 5);
		Table t2 = new Table(p1, 7);

		t1.start();
		t2.start();
	}
}

class Printer {
	synchronized void table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + i * n);
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Table extends Thread {
	Printer printer;
	int num;

	public Table(Printer printer, int num) {
		this.printer = printer;
		this.num = num;
	}

	@Override
	public void run() {
		printer.table(num);
	}
}
