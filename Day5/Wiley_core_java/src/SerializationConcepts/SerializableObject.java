package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObject {
	public static void main(String[] args) {
		Book b1 = new Book(101,"ABC");
		
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day5\\Wiley_core_java\\data\\books.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout); 
			oout.writeObject(b1);
			//oout.close();
			fout.close();
			System.out.println("Book has been added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
