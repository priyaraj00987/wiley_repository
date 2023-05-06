package SerializationConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableObject {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day5\\Wiley_core_java\\data\\books.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Book b = (Book) oin.readObject();
			System.out.println("Book Number: "+b.bookCode);
			System.out.println("Book Name: "+b.bookName);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
