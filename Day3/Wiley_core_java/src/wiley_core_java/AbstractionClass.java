package wiley_core_java;

abstract class Test1{
	{
		System.out.println("test 1 instance block"); // instance block
	}
	static {
		System.out.println("test 1 static block"); // static block is only run once no matter number of objects
	}
	public abstract void m1();
	
	public void m2() {
		System.out.println("Test1 m2");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method in abstract class");
	}
	
	public Test1() {
		System.out.println("Test 1 constructor");
	}
}

class Test2 extends Test1{
	{
		System.out.println("test 2 instance block"); // instance block executes as much time as number of objects created
	}
	
	static {
		System.out.println("Test 2 static block");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Test2 m1");
	}
	
	public Test2() {
		System.out.println("Test 2 constructor");
	}
}

class Test3 extends Test2{
	//@Override
	public void m1() {
		System.out.println("Test3 m1");
	}
}

public class AbstractionClass {
	public static void main(String[] args) {
		Test2 t2 = new Test2(); // first t1 constructor will run, parent class will run first
		Test2 t3 = new Test2();
		//Test3 t3 = new Test3();
		t2.m1();
		t2.m2();
		//t3.m1();
		
		Test1.main(args);
	}
}
