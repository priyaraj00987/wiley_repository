package Day2.Wiley_Code_Java.src.wiley_core_java;

public class ConstructorTypes {
	
	public ConstructorTypes(int a, int b) {
		this();
		System.out.println("2 args: "+ (a+b));
	}
	
	public ConstructorTypes(float a, float b) {  // constructor overloading
		System.out.println("2 args: "+ (a-b));
	}
	
	public ConstructorTypes() {
		System.out.println("0 args");
	}
	
	public static void main(String[] args) {
		ConstructorTypes ct1 = new ConstructorTypes(); // 0 args
		ConstructorTypes ct2 = new ConstructorTypes(1,1); //2 args with int
		ConstructorTypes ct3 = new ConstructorTypes(1.0f,1.0f); // 2 args with float
	}
}
