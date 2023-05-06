package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(\\d+) divide by (\\d+)$");
		Matcher matcher = pattern.matcher("10 divide by 5");
		int result = 0;
		if(matcher.find()) {
			result = Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
		}
		System.out.println(matcher.replaceFirst("$1/$2")+"="+result);		
	}
}
