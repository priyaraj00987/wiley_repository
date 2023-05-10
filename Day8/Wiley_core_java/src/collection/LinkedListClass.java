package Day8.Wiley_core_java.src.collection;

import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Priya");
		ll.add("Raj");
		ll.add(null);
		ll.add("Raj");
		System.out.println(ll);
	}
}
