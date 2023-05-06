package string_classes;

public class StrBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley"); //object
		StringBuffer sb1 = new StringBuffer("Wiley"); //object
		
		String ss = "Wiley";
		
		System.out.println(sb.equals(sb1)); //false
		System.out.println(ss.equals(sb1.toString())); //true
		System.out.println(sb);
		
		sb.append(" Program");
		System.out.println(sb); //appended data
		
		sb.insert(5, "Edge");
		System.out.println(sb);
		
		System.out.println(sb.delete(5,9));
		System.out.println(sb.reverse());
	}
}
