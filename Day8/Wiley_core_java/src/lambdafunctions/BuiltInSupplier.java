package lambdafunctions;

import java.util.function.Supplier;

public class BuiltInSupplier {
	public static void main(String[] args) {
		Supplier<String> message = () -> "Hello";
		System.out.println(message.get());
	}
}
