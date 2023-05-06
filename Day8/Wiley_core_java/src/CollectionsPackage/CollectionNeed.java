package CollectionsPackage;

class Student{}
class Book{}

public class CollectionNeed {
	public static void main(String args) {
		Student[] student = new Student[10];
		student[0] = new Student();
		student[1] = new Student();
		
		Object[] obj = new Object[10];
		obj[0] = new Student();
		obj[1] = new Book();
	}
}
