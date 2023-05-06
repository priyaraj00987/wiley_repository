package CollectionsPackage;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(2);
		s.push(1);
		s.push(null);
		s.push(2);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.search(2));
		s.empty();
		System.out.println(s);
		for(int i: s) {
			System.out.println(i);
		}
	}
}
