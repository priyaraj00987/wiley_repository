package CollectionsPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	@Override
	public boolean add(Object o) {
		if(this.contains(o))
			return true;
		return super.add(o);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CustomArrayList list = new CustomArrayList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(3);
//		list.add(4);
//		list.add("A");
//		System.out.println(list);
//		
		
//		Set<GeniusStudent> setStudents = new HashSet<>();
		List<GeniusStudent> setStudents  = new ArrayList<>();
		GeniusStudent g1 = new GeniusStudent(1, "Rishav",10);
		GeniusStudent g2 = new GeniusStudent(2, "Steve",20);
		GeniusStudent g3 = new GeniusStudent(3, "Rishav",30);
		setStudents.add(g1);
		setStudents.add(g2);
		setStudents.add(g3);
		System.out.println(setStudents);
	}

}
