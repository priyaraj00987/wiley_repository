package IOStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FIStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\output.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		int i;
		
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
		}
		bis.close();
		fin.close();
	}
}
