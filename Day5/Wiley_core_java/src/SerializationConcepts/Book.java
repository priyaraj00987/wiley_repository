package SerializationConcepts;

import java.io.Serializable;

public class Book implements Serializable{
	private static final long serialVersionUID=1L;
	int bookCode;
	String bookName;
	public Book(int bookCode, String bookName) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
	}
	
}
