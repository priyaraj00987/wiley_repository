package ThreadsConcept;

class Parent{
	public void m1() {
		System.out.println("Inside m1");
	}
}

class T1 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread by class");
	}
}

class T2 extends Parent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Thread by Runnable interface");
	}
	
}

public class ThreadClass {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread thread = new Thread(t2);
		thread.start();
	}
}
