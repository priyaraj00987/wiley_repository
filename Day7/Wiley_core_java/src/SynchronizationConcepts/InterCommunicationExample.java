package SynchronizationConcepts;

class BankAccount{
	int amount = 1000;
	
	public synchronized void withDrawAmount(int amount) {
		if(this.amount<amount) {
			System.out.println("Insufficient amount");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Withdraw successful");
	}
	public synchronized void depositAmount(int amount) {
		this.amount+=amount;
		System.out.println("Amount deposited");
		notify();
	}
}

public class InterCommunicationExample {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				ba.withDrawAmount(1500);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				ba.depositAmount(1000);
			}
		};
		t1.start();
		t2.start();
	}
}
