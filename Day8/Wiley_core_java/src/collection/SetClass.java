package CollectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet<String> hs = new HashSet<>();
//		hs.add("a");
//		hs.add("b");
//		hs.add("a");
//		System.out.println(hs);
//		List<String> list = new ArrayList<>();
//		Set<String> ts = new TreeSet<>();
//		list.add("Rishav's wedding");
//		list.add("Funeral");
//		list.add("Birth");
//		list.add("School");
//		ts.addAll(list);
//		System.out.println(ts);
//		System.out.println(ts.descendingSet());
//		LinkedHashSet<String> lhs = new LinkedHashSet<>();
//		lhs.add("hello");
//		lhs.add("world");
//		lhs.add("Summa");
//		//lhs.remove("world");
//		System.out.println(lhs);
//		TreeSet<String> ts1 = new TreeSet<>();
//		
//		ts1.add("a");
//		ts1.add("b");
//		ts1.add("c");
//		
//		System.out.println(ts1.first().compareTo(ts1.last()));
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "D"));
	      System.out.println("List: " + list);
	      Set<String> set = new HashSet<>(list);
	      System.out.println("Set: " + set);
	}
}
