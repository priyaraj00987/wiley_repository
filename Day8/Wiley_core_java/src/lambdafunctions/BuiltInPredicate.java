package lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {
	public static void main(String[] args) {
		Predicate<String> checkLength = (String a) -> a.length() == 4;
		List<String> fi = Arrays.asList("Java", "Python", "Angular", "Jira");
		fi.forEach((l) -> {
			if(checkLength.test(l)) {
				System.out.println(l);
			}
		});
	}
}
