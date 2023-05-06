package wiley_core_java;

public class VarScope {
	
	int ins = 20;
	static String name = "Praveen"; // no need of object calling
	int val=9;
	int val1 = 12;
	
	public void sum() { 
		int val=22;
		System.out.println(this.val+val1);
	}
	
	public static void main(String[] args) {
		int ins = 10; // takes precedence
		VarScope vs = new VarScope();
		int loc = 5;
		System.out.println(vs.ins);
		System.out.println(ins);
		System.out.println(loc);
		System.out.println(name);
		vs.sum();
	}
}
