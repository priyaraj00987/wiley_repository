package ThreadsConcept;

class SupportClass extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("Not daemon thread");
		}
	}
}

public class DaemonType {
	public static void main(String[] args) {
		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		
		t1.setDaemon(true);
		//t2.setDaemon(true); //does not print two daemon threads upon uncommenting
		t1.start(); // daemon thread
		t2.start(); //not deamon thread
	}
}
