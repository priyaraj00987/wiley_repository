package ThreadsConcept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WeddingCardWrap extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}

public class RishavWeddingCard {
	public static void main(String[] args) {
		//ExecutorService executor = Executors.newFixedThreadPool(4);
		//ExecutorService executor = Executors.newCachedThreadPool();
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
		
//		for(int i=1;i<=100;i++) {
//			executor.schedule(new WeddingCardWrap(),3,TimeUnit.SECONDS);
//			//executor.execute(new WeddingCardWrap());
//		}
		//executor.scheduleAtFixedRate(new WeddingCardWrap(), 10, 2, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new WeddingCardWrap(), 5, 2, TimeUnit.SECONDS);
	}
}
