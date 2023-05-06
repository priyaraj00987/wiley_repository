package CollectionsPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {
	public static void main(String[] args) {
		Map<Integer, String> mp = new ConcurrentHashMap<Integer, String>();
		mp.put(1, "Java");
		mp.put(2, "Python");
		
		Iterator it = mp.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Key: "+key+" Value: "+mp.get(key));
			mp.put(3,"C++");
		}
	}
}
