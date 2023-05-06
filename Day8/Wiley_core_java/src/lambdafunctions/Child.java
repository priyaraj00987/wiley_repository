package lambdafunctions;

//@FunctionalInterface
public interface Child extends Parent{
	public void sayHello();
	default void hello(){
		
	}
}
