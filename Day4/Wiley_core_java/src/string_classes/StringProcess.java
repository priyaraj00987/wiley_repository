package string_classes;

public class StringProcess {
	public static void main(String[] args) {
		String s1 = "Wiley";//literal
		String s2 = "Wiley";//literal
		
		String s3 = new String("Wiley"); //object
		String s4 = new String("Wiley"); //object
		
//		System.out.println(s1==s2); //true
//		System.out.println(s2==s3); //false
//		System.out.println(s3==s4); //false
		
		String str = "I am Praveen Rao V P";
		String str1 = "Java";
		String str2 = str + " " + str1;
		System.out.println(str2);
		System.out.println(str);
		System.out.println(str.length()); // returns length of string
		System.out.println(str.charAt(3)); //returns char at index specified
		
		String str3 = str.replace("Praveen","prao"); //replace
		System.out.println(str3);
		
		String str4[] = str.split("");
		for(String s: str4) {
			System.out.print(s);
		}
		System.out.println();
		
		String userInput = " mobile phones ";
		System.out.println(userInput.trim()); //trims spaces at begining and end of string
		
		System.out.println(str.substring(0,5));
		System.out.println(str.toUpperCase());
	}
}
