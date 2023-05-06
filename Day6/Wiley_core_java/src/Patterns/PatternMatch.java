package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
		Matcher matcher = pattern.matcher("agent 0007");
		
		if(matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(0));
		}
		boolean found = matcher.find();
		boolean found2 = matcher.matches();
		System.out.println("Found: "+found2);
		System.out.println("Found: "+found);
		
	}
}
