package CollectionsPackage;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueClass {
	public static void main(String[] args) {
//		Queue<String> aq = new PriorityQueue<>();
//		aq.add("a");
//		aq.add("b");
//		aq.add("c");
//		
//		System.out.println(aq);
//		
//		Deque<String> dq = new LinkedList<>();
//		dq.add("1");
//		dq.addFirst("first");
//		dq.add("a");
//		dq.add("b");
//		dq.addLast("BBB");
//		dq.add("fff");
//		
//		dq.removeFirst();
//		dq.removeLast();
//		System.out.println(dq);
		BlockingQueue<String> bq = new LinkedBlockingQueue<>();
		bq.add("1111");
		bq.add("2222");
		System.out.println(bq);
	}
}
