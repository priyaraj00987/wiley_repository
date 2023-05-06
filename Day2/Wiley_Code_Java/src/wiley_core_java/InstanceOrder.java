package wiley_core_java;

public class InstanceOrder {
	
	
	int age;
	
	// Instance Block
	{
		name = "Praveen";
		System.out.println("Instance order"); //takes precedence over constructors
	}
	
	public InstanceOrder() {
		name = "Rao"; 
		System.out.println("Inside 0 args constructor");
	}
	
	
	public InstanceOrder(int a, int b) {
		System.out.println("Inside 2 args constructor");
	}
	String name = "V P";
	
	// Static block, only executes once regardless of number of objects, but holds top precedence
	static {
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		String name = "..";
		InstanceOrder inOr = new InstanceOrder();
	    new InstanceOrder();
		System.out.println(inOr.name); // prints Rao as constructor replaces Praveen
	}
}
