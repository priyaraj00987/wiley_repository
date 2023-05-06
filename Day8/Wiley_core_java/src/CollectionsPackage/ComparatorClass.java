package CollectionsPackage;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1>o2) {
//			return -1;
//		} else if(o1<o2) {
//			return 1;
//		}
	//}	
	return o1.compareTo(o2);


}

public class ComparatorClass {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(new MyClass());
		
		ts.add(4);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		for (int i = 0; i < ts.size(); i++) {

		}

		System.out.println(ts);
	}
}
