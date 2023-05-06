package Exceptions;

import java.util.ArrayList;

class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}


public class Unchecked {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		
		if(!arr.contains("0")) {
			try {
				throw new StringNotFound("The string is not found");
			} catch(StringNotFound e) {
				e.printStackTrace();
			}
		}
		System.out.println("Messages");
	}
}
