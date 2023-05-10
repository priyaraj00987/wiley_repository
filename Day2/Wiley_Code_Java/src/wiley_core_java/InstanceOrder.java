package Day2.Wiley_Code_Java.src.wiley_core_java;

public class InstanceOrder {
	
	
	int age;
	
	// Instance Block
	{
		name = "Priya";
		System.out.println("Instance order"); //takes precedence over constructors
	}
	
	public InstanceOrder() {
		name = "priya raj";
		System.out.println("Inside 0 args constructor");
	}
	
	
	public InstanceOrder(int a, int b) {
		System.out.println("Inside 2 args constructor");
	}
	String name = "V P";
	

	static {
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		String name = "..";
		InstanceOrder inOr = new InstanceOrder();
	    new InstanceOrder();
		System.out.println(inOr.name);
	}
}
