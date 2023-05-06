package wiley_core_java;

class A{
	public void printA() {
		System.out.println("A");
	}
}
class B extends A{
	public void printB() {
		System.out.println("B");
	}
}
class C extends A{
	public void printC() {
		System.out.println("C");
	}
}
class D extends B{
	public void printD() {
		System.out.println("D");
	}
}
class E extends D{
	public void printE() {
		System.out.println("E");
	}
}


public class HybridInheritance {
	public static void main(String[] args) {
		E e = new E();
		C c = new C();
		e.printA();
		e.printB();
		e.printD();
		e.printE();
		c.printA();
		c.printC();
	}
}
