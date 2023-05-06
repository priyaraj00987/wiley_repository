package lambdafunctions;

@FunctionalInterface
public interface Printable {
	String print(String s);
//	void getName(int a, int b);
	default void printAll() {
		
	}
	static int add() {
		return 0;
	}
}
