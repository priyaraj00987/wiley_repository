package Exceptions;

// IN java, uncaught exceptions occur when an exception is thrown within a method and 
// there is no code to catch and handle the exception. When this happens. the exception is 
// propagated up the call stack until it is caught by an appropriate exception handler or
// until it reached the top of the call stack and is terminated.

public class ExceptionPropagation {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught: "+e.getMessage());
			//e.printStackTrace();
		}
	}

	public static void method1() throws Exception{
		// TODO Auto-generated method stub
		method2();
	}

	public static void method2() throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Exception occured in method 2");
	}
	
}
