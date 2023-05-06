package wiley_core_java;

class Test {
	public static int add(int v1, int v2) {
		int val = v1+v2+10;
		return val;
	}
}


public class MethodTypes {
	
	public void add(int v1, int v2) {
		int val = v1 + v2;
		System.out.println(val);
		this.sub(9,5);
	}
	// no need to create parent class object
	public static int multiply(int v1, int v2) {
		int val = v1*v2;
		// System.out.println(val);
		return val;
	}
	
	public void sub(int v1, int v2) {
		int val = v1-v2;
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		MethodTypes mt = new MethodTypes();
		int m = multiply(1,2); // static method
		mt.add(2,3); //non static method
		System.out.println(m);
		System.out.println(Test.add(1, 1)); // static method from other classes
	}
}
