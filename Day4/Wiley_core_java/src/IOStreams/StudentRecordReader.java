package IOStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordReader {
	DataInputStream dataInput ;
	public StudentRecordReader(String filename) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(filename));
	}
	
	public List<Student> readAll() throws IOException {
		List<Student> listStudent = new ArrayList<>();
		try {
			while(dataInput.available()>0) { //parse until eof
				String name = dataInput.readUTF();
				String gender = dataInput.readUTF();
				int age = dataInput.readInt();
				char grade = dataInput.readChar();
				//System.out.println("Name: "+name+"")
				Student student = new Student(name,gender,age,grade);
				//System.out.println(name==null);
				listStudent.add(student);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		dataInput.close();
		return listStudent;		
	}
	
	public static void main(String[] args) {
		String inputFile = "D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\students.dat";
		try {
			StudentRecordReader reader = new StudentRecordReader(inputFile);
			List<Student> listOfStudents = reader.readAll();
			for(Student s: listOfStudents) {
				System.out.println(s.getName()+"\t"+s.getGender()+"\t"+s.getAge()+"\t"+s.getGrade());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
