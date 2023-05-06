package SynchronizationConcepts;

public class DeadlockConcept {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	private static class LockThread extends Thread{
		@Override
		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread1 on hold: Lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("Thread 1 waiting for lock2");
			synchronized (Lock2) {
				System.out.println("Thread1 on hold: lock2");
			}
		}
	}
	public static void main(String[] args) {
		LockThread lt1 = new LockThread();
		lt1.start();
	}
}
