package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {
		String input = "The key to learning programming is practice";
		Pattern pattern = Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			System.out.println("Found from "+start+"to"+(end-1));
		}
		String pat = "learn";
		int index = input.indexOf(pat);
		if(index!=-1) {
			System.out.println(index);
		}
	}
}
