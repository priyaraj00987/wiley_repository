package ThreadsConcept;

class Demo implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//for(int i=1;i<=100;i++)
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
}

public class ThreadGroupConcept {
	public static void main(String[] args) {
		ThreadGroup tgParent = new ThreadGroup("Parent group");
		ThreadGroup tg2 = new ThreadGroup(tgParent,"Child Group");
		
		Thread t1 = new Thread(tgParent, new Demo(), "First");
		Thread t2 = new Thread(tgParent, new Demo(), "Second");
		Thread t3 = new Thread(tg2, new Demo(), "Third");
		//Thread t4 = new Thread(tg2, new Demo(), "Fourth");
		//tgParent.list();
		System.out.println("Active group of threads: "+tgParent.activeCount());
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
		tgParent = tgParent.getParent();
		System.out.println("Active group of threads: "+tgParent.activeCount());
	}
}
