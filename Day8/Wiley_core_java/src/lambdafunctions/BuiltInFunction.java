package lambdafunctions;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	private static HashMap<Integer, String> Employee = new HashMap<>();
	
	public static void add(String name, int id) {
		if(!Employee.containsKey(id)) {
			Employee.put(id, name);
		} else {
			System.out.println("Employee already exist");
		}
	}
	public static void main(String[] args) {
		Function<Integer, String> gets = (Integer ID) -> {
			if(Employee.containsKey(ID)) {
				return Employee.get(ID);
			}
			return "Invalid ID";
		};
		add("Rishav",1006);
		add("James Bond",007);
		add("AKA", 1005);
		System.out.println("ID: 1006\tName: "+gets.apply(1006));
	}
}

