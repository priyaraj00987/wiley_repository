package Exceptions;

class AgeNotValidException extends Exception{
	public AgeNotValidException(String message) {
		super(message);
	}
	
	public String getMessage(){
		return "The age is not valid";
	}
	public String toString() {
		return "Age not applicable";
	}
}

public class CustomException {
	public static void getAge(int age) throws AgeNotValidException {
		if(age<18) {
			try {
				throw new AgeNotValidException("Age not valid");
			} catch(AgeNotValidException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else {
			System.out.println("You are eligible");
		}
	}
	public static void main(String[] args) throws AgeNotValidException {
		getAge(14);
	}
}
