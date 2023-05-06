package GenericsCon;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
	public static void main(String[] args) {
//		Printer<Cat> printer = new Printer<Cat>(new Cat());
//		printer.print();
//		
//		Printer<Dog> printer1 = new Printer<Dog>(new Dog());
//		printer1.print();
//		
//		ArrayList<Object> animals = new ArrayList<>();
//		animals.add(new Cat());
//		animals.add(new Dog());
//		for(Object a: animals) {
//			System.out.println(a);
//		}
//		
//		shout("Buy vegetables","Onions");
//		shout(new Dog(),"wanted");
//		shout(200000,"Give");
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		printList(myList);
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat());
		printList(catList);
	}
	private static void printList(List<?> list) {
		System.out.println(list);
	}
	
//	private static <T> void shout(T shoutOut) {
//		System.out.println(shoutOut + "...!!!");
//	}
	private static <T,V> V shout(T shoutOut, V valueToPrint) {
		System.out.println(shoutOut + "...!!!"+valueToPrint);
		return valueToPrint;
	}
}
