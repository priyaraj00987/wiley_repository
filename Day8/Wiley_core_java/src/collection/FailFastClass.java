package CollectionsPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {
	public static void main(String[] args) {
		//List<String> list = new ArrayList<>();
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		
		Iterator<String> itr = list.iterator();
		list.add("c");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
