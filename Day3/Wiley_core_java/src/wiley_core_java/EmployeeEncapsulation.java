package wiley_core_java;

class Employee{
	private String name;
	private int age;
	
	public void returnDetails() {
		System.out.println(name+": "+age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}



public class EmployeeEncapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Praveen");
		emp.setAge(19);
		emp.returnDetails();
		// System.out.println(emp.name); emp.name is private, cannot access directly
	}
}
