package CollectionsPackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc = new Vector<>();
		vc.addElement("a");
		vc.addElement("b");
		vc.addElement("c");
		vc.addElement("d");
		vc.addElement("e");
		
//		Enumeration<String> e = vc.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//		Iterator<String> i = vc.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		ListIterator<String> li = vc.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}

}
