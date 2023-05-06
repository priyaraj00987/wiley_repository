package wiley_core_java;

// single inheritance
class Animal{
	public void eat() {
		System.out.println("Eat");
	}
	public void sleep() {
		System.out.println("Sleep");
	}
}

class Lion extends Animal{
	public void roar() {
		System.out.println("Roar");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.roar(); //roar
		lion.eat(); //eat 
		lion.sleep(); //sleep
	}
}
