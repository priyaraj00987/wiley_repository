package day10assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	private int rollNo;
	private String name;
	private int problems_solved;
	private int grade;
	public Student(int rollNo, String name, int problems_solved, int grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.problems_solved = problems_solved;
		if(problems_solved>18) {
			this.grade=90;
		} else if(problems_solved>15) {
			this.grade=80;
		} else {
			this.grade = 70;
		}
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProblems_solved() {
		return problems_solved;
	}
	public void setProblems_solved(int problems_solved) {
		this.problems_solved = problems_solved;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}

public class StudentStreams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"Praveen",20,80));
		students.add(new Student(2,"Anonymous",10,10));
		students.add(new Student(3,"Elon ",21,85));
		students.add(new Student(4,"ABCDE",15,60));
		students.add(new Student(5,"FGHIJ",18,70));
		students.add(new Student(6,"KLMNO",16,65));
		students.add(new Student(7,"PQRST",15,60));
		
		List<Student> returnQuery = (List<Student>) students.stream()
				.filter(p->p.getProblems_solved()>15)
				.limit(5)
				.sorted((a,b)->b.getGrade()-a.getGrade())
				.collect(Collectors.toList());
		System.out.println("Rollno\tName\tProblems Solved\tGrade");
		for(Student s: returnQuery) {
			System.out.println(s.getRollNo()+"\t"+s.getName()+"\t"+s.getProblems_solved()+"\t"+s.getGrade());
		}
	}

}
