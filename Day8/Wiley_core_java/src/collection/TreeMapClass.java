package CollectionsPackage;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<Integer, String> tmap = new TreeMap<>();
//		tmap.put(1, "A");
//		tmap.put(3,"B");
//		tmap.put(2,"C");
//		tmap.put(4, "D");
//		System.out.println(tmap);
//		tmap.forEach((k,v) -> System.out.println("Key: "+k+" value: "+v));
//		System.out.println("First key: "+tmap.firstKey());
//		System.out.println("Last key: "+tmap.lastKey());
//		
//		Set<Integer> keysLessThan3 = tmap.headMap(3).keySet();
//		System.out.println(keysLessThan3);
//		Set<Integer> keysGrThan3 = tmap.tailMap(3).keySet();
//		System.out.println(keysGrThan3);
		TreeMap<String, Integer> tmap = new TreeMap<>();
		tmap.put("a", 1);
		tmap.put("c", 3);
		tmap.put("da", 45);
		tmap.put("ca", 7);
		tmap.forEach((k,v) -> System.out.println("Key: "+k+" value: "+v));
	}

}
