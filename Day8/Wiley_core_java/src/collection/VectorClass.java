package CollectionsPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int size = 1000000;
//		List<Integer> vl = new Vector<>();
//		long start1 = System.currentTimeMillis();
//		for(int i=0;i<size;i++) {
//			vl.add(i);
//		}
//		long end1 = System.currentTimeMillis();
//		System.out.println("Time taken by Vector: "+(end1-start1));
//		List<Integer> al = new ArrayList<>();
//		for(int i=0;i<size;i++) {
//			al.add(i);
//		}
		ArrayList<Integer> multiThreadArray = new ArrayList<>();
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				multiThreadArray.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				multiThreadArray.add(i);
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		long end = System.currentTimeMillis();
		System.out.println("Time taken by arrayList: "+(end-start));
		
		List<Integer> multiThreadVector = new Vector<>();
		start = System.currentTimeMillis();
		Thread t3 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				multiThreadVector.add(i);
			}
		});
		Thread t4 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				multiThreadVector.add(i);
			}
		});
		
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		end = System.currentTimeMillis();
		System.out.println("Time taken by vector: "+(end-start));
	}
}
