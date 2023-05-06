package string_classes;
import java.util.StringTokenizer;
public class StringTokenizerClass {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java Programming, is really fun!",","); //content,delimiter parameters
		//Java Programming and is really fun are different tokens
		System.out.println(st.countTokens()); // counts number of words in a token
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
	}
}
