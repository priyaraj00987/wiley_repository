package lambdafunctions;

interface Sayable{
	void say();
}

interface GetInfo{
	void getMessage(String s);
}
class Info{
	Info(String s){
		System.out.println(s);
	}
}

public class MethodReferenceClass {
	public void hello() {
		System.out.println("Hello");
	}
	public static void saySomething() {
		System.out.println("Saying something at static method");
	}
	public static void processSomething() {
		System.out.println("Processing something");
	}
	public static void main(String[] args) {
		GetInfo i = Info::new;
		i.getMessage("New message");
		MethodReferenceClass mt = new MethodReferenceClass();
		Sayable isv = mt::hello;
		isv.say();
		Sayable s = MethodReferenceClass::saySomething; //class::method
		s.say();
		
		Thread t = new Thread(MethodReferenceClass::processSomething);
		t.start();
		Thread t1 = new Thread(new MethodReferenceClass()::hello);
		t1.start();
	}
}
