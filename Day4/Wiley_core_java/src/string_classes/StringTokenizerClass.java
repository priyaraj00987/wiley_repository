package Day4.Wiley_core_java.src.string_classes;
import java.util.StringTokenizer;
public class StringTokenizerClass {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java Programming, is really fun!",",");

		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
	}
}
