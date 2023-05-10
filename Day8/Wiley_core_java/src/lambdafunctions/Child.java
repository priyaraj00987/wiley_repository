package Day8.Wiley_core_java.src.lambdafunctions;

//@FunctionalInterface
public interface Child extends Parent{
	public void sayHello();
	default void hello(){
		
	}
}
