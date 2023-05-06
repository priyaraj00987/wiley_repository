package string_classes;

import java.util.Arrays;
import java.util.List;

public class StringFormat {
	public static void main(String[] args) {
//		String title = "Java Developer";
//		float salary = 170000f;
//		System.out.format("%s has %.2f salary", title,salary);
		
		List<String> techStack = Arrays.asList(
				"Essential Java",
				"Head First Java",
				"Java Design Patterns"
				);
		
		for(String book: techStack) {
			System.out.format("%-20s -  in Stock%n", book);
		}
	}
}