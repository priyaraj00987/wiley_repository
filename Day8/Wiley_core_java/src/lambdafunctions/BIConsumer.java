package lambdafunctions;

import java.util.function.BiConsumer;

public class BIConsumer {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> el = (Integer age, Integer percent) -> {
			if(age>18 && percent>75) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not eligible");
			}
		};
		el.accept(18, 90);
	}
}
