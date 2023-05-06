package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fout = new FileOutputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\data4.txt");
//		String str = "Wiley";
//		byte[] b = str.getBytes();
//		fout.write(b);
//		fout.flush();
//		fout.close();
		FileInputStream fin = new FileInputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\data4.txt");
		int i=0;
		
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
	}
}
