package lambdafunctions;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.lang.Math;

public class BIFunctionClass {
	public static void main(String[] args) {
		UnaryOperator<Double> power = a -> Math.pow(a, 2);
		System.out.println(power.apply((double) 2));
		
		BinaryOperator<Integer> addition = (a,b) -> a+b;
		System.out.println(addition.apply(20, 49));
	}
}
