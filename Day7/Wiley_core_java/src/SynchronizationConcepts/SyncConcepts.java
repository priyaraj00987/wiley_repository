package SynchronizationConcepts;

class Sheet{
	public void writeLn(int k) { // or public synchronized void writeLn()
		synchronized(this){
			for(int i=1;i<=5;i++) {
				System.out.println(i*k);
			}
		}
	}
}

class Person1 extends Thread{
	Sheet st;
	public Person1(Sheet st) {
		super();
		this.st=st;
	}
	
	@Override
	public void run() {
		st.writeLn(10);
	}
}

class Person2 extends Thread{
	Sheet st;
	public Person2(Sheet st) {
		super();
		this.st=st;
	}
	
	@Override
	public void run() {
		st.writeLn(5);
	}
}

public class SyncConcepts {
	public static void main(String[] args) {
		Sheet st = new Sheet();
		Person1 p1 = new Person1(st);
		Person2 p2 = new Person2(st);
		
		p1.start();
		p2.start();
	}
}
