package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String creditCardNumber = "1234-5678-8923-5342";
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(creditCardNumber);
		String maskedCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
		System.out.println(maskedCard);
	}

}
