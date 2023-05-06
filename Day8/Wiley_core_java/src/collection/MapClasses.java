package CollectionsPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class MapClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, String> map = new HashMap<>();
//		map.put("a", "A");
//		map.put(null, null);
//		map.put("b", "B");
//		map.put(null, "NullValue");
//		System.out.println(map);
//		Map<String, Integer> empID = new HashMap<>();
//		empID.put("abc", 1);
//		empID.put("def", 2);
//		empID.put("ghi", 3);
//		empID.put("jkl", 4);
//		
//		System.out.println(empID);
//		System.out.println(empID.get("abc"));
//		System.out.println(empID.containsKey("def"));
//		System.out.println(empID.containsValue(3));
//		
//		empID.replace("abc", 5);
//		System.out.println(empID);
//		empID.putIfAbsent("abc", 3);
//		System.out.println(empID);
		
		//LinkedHashMap
		Map<String, Integer> myMap  = new LinkedHashMap<>();
		myMap.put("a",1);
		myMap.put("b",2);
		myMap.put("C",8);
		System.out.println(myMap);
	}
}
