package Day6.Wiley_core_java.src.ThreadsConcept;

class TPriority extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(
					"Thread name -"+Thread.currentThread().getName()+
					"   Thread priority -"+Thread.currentThread().getPriority()+
					"   Thread ID -"+Thread.currentThread().getId()
					);
		}
	}
}

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
//		Thread.currentThread().setPriority(8);
//		System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
//		TPriority t1 = new TPriority();
//		TPriority t2 = new TPriority();
//		t1.setPriority(10);
//		t1.start();
//		t2.start();
		
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();
		
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t3.setName("3rd Thread");
		
		t1.start();
		t1.join(100);
		System.out.println(t1.getState());
		t2.start();
		t2.join();
		System.out.println(t2.getState());
		t3.start();
	}
}
