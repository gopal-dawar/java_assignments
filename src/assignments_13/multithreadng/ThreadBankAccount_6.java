package assignments_13.multithreadng;

public class ThreadBankAccount_6 {
	public static void main(String[] args) {

		BankAccount b = new BankAccount();

		Bank b1 = new Bank(b, 100);
		Bank b2 = new Bank(b, 200);
		Bank b3 = new Bank(b, 300);
		Bank b4 = new Bank(b, 400);
		Bank b5 = new Bank(b, 500);

		b1.start();
		b2.start();
		b3.start();
		b4.start();
		b5.start();

//		synchronization -> This not wait when some method take more time, in this time this work another task at time
	}
}

class BankAccount {

	static int balence = 2500;

	synchronized void withdraw(int amount) {
		balence = balence - amount;
		System.out.println("Balence is : " + balence);
		System.out.println("Removed : " + amount);
	}
}

class Bank extends Thread {
	BankAccount bankAccount;
	int amount;

	public Bank(BankAccount bankAccount, int amount) {
		this.bankAccount = bankAccount;
		this.amount = amount;
	}

	@Override
	public void run() {
		bankAccount.withdraw(amount);
	}

}