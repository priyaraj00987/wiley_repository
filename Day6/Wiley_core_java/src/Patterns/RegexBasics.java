package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[] args) {
		//String re = ".."; . - single character(any)
		//String re = "\\w*"; // w - (a-z A-Z 0-9, no special characters except _)
		//String re = "\\w\\W\\W"; // W for special char, w for characters
		//String re = "\\S\\s"; // s - space, S - non whitespace
//		String re = "\\D\\d"; //d - digit, D - non-digit(specChars also)
		String re = "";
		String text = "$8";
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(text);
		
		boolean result = matcher.matches();
		System.out.println(result);
	}
}
