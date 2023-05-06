package wiley_core_java;

public class CreateClass implements Cloneable{
	int a = 10;
	public void add() {
		System.out.println("Number Addition");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// Create object using new keyword
		CreateClass cc = new CreateClass();
		cc.add();
		System.out.println("New: " + cc);
		
		// Creating object using newInstance()
		try {
			Class c = Class.forName("wiley_core_java.CreateClass");
			// @SuppressWarnings("deprecation")
			CreateClass ci = (CreateClass) c.newInstance();
			ci.add();
			System.out.println("New Instance: "+ ci);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//Creating object using Object.clone() method
		CreateClass cclone = (CreateClass) cc.clone();
		cclone.add();
		System.out.println("Object Clone:"+cclone);
		
	}
}
