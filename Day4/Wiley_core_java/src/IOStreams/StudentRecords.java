package IOStreams;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.util.List;
import java.util.ArrayList;


class Student{
	private String name;
	private String gender;
	private int age;
	private char grade;
	public Student(String name, String gender, int age, char grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
		
}

public class StudentRecords {
	
	DataOutputStream dataOutput;
	
	public StudentRecords(String outputFile) throws FileNotFoundException {
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(Student student) throws IOException {
		dataOutput.writeUTF(student.getName());
		dataOutput.writeUTF(student.getGender());
		dataOutput.writeInt(student.getAge());
		//dataOutput.writeBytes(Character.toString(student.getGrade()));
		dataOutput.writeChar(student.getGrade());
		//dataOutput.writeBytes("\n");
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	public static void main(String[] args) throws IOException {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Praveen","Male",21,'S'));
		studentList.add(new Student("Anon","Male",23,'A'));
		String outputFile = "D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\students.dat";
		try {
			StudentRecords outputWriter = new StudentRecords(outputFile);
			for(Student st: studentList) {
				outputWriter.writer(st);
			}
			outputWriter.save();
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
