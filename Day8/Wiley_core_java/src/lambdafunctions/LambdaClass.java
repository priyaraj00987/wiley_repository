package lambdafunctions;

public class LambdaClass {
	
	static String printThing(Printable thing) {
		return thing.print("EDGE");
	}
	public static void main(String[] args) {
		Product myProd = new Product();
//		printThing(() -> {
//			System.out.println("Lambda function");
//		});
		Printable lamb = s -> {return "Wiley "+s;};
//		printThing(myProd);
//		lamb.print("a");
		System.out.println(printThing(lamb));
	}
}
