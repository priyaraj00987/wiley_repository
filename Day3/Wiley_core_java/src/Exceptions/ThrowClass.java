package Exceptions;

public class ThrowClass {
	
	public static void m1() throws InterruptedException {
		m2();
	}
	
	public static void m2() throws InterruptedException  {
		Thread t = new Thread();
		System.out.println("Thread is running...");
		t.sleep(1000);
		System.out.println("Sleeping");
		t.wait();
	}
	
	public static void main(String[] args) throws InterruptedException {
		m1();
	}
}
