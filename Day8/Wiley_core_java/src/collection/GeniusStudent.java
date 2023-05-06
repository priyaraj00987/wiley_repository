package CollectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GeniusStudent implements Comparable<GeniusStudent> {
	public int id;
	public String name;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public GeniusStudent(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(GeniusStudent o) {
		if(id==o.id) return 0;
		else if(id>o.id) return 1;
		else return -1;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj==null) {
			return false;
		}
		if(obj==this) {
			return true;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		GeniusStudent other = (GeniusStudent)obj;
		return id==other.id && Objects.equals(name, other.name); 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<GeniusStudent> setStudents  = new ArrayList<>();
		//SalaryComparator s = new SalaryComparator();
		GeniusStudent g1 = new GeniusStudent(1, "Rishav",10);
		GeniusStudent g2 = new GeniusStudent(2, "Steve",14);
		GeniusStudent g3 = new GeniusStudent(3, "Rishav",16);
		setStudents.add(g1);
		setStudents.add(g2);
		setStudents.add(g3);
		Collections.sort(setStudents, new SalaryComparator());
		System.out.println(setStudents);
	}
}
