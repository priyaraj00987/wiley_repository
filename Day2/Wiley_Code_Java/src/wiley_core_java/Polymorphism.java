package wiley_core_java;

class Trial{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Trial t = new Trial();
		t.add(1,2); //3
		t.add(1,2,3); //6
	}
	
}
