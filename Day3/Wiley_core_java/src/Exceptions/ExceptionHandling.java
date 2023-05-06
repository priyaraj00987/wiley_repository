package Exceptions;


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First statement");
		
		int arr[] = {1,2,3,4};
		
		try {
			System.out.println(arr[1]);
			//System.out.println("summa");
			//System.out.println(arr[4]); // array index out of bounds exception
			//int a = 12/0; //Arithmetic error
			String s = "OneTwoThree"; 
			System.out.println(s.charAt(13)); //StringIndexOutOfBoundsException
			System.out.println("Other"); //this line doesnt get executed
		} catch(ArrayIndexOutOfBoundsException e) {  // most child class
			e.printStackTrace(); //getMessage and toString doesnt work in java 20
		} catch(IndexOutOfBoundsException e) { //child class
			e.printStackTrace();
		} catch(Exception e) {  //parent class //Exception is the parent class of all exceptions
			e.printStackTrace();
		}
		
		System.out.println(arr[2]);
	}

}
