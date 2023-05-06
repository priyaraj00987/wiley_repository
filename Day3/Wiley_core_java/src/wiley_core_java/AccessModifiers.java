package wiley_core_java;

interface Emp{
	public void printDetails();
}

class Employees implements Emp{
	private int age;
	public String name;
	protected int empId;
	@Override
	public void printDetails() {
		System.out.println(name+": "+empId+ " is "+age+" years old");
	}
	
}

public class AccessModifiers extends Employees{	
	public static void main(String[] args) {
		// Employees employee = new Employees();
		AccessModifiers employee =  new AccessModifiers();
		Employee e = new Employee();
		employee.empId = 101;
		// employee.age = 10; age is private
		employee.printDetails();
		e.setName("Praveen");
		e.setAge(21);
		e.returnDetails();
	}
}
