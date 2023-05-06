package IOStreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOStream {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\output.txt");
		BufferedOutputStream bof = new BufferedOutputStream(fout);
		String str = "I am a Programmer";
		
		byte[] b = str.getBytes();
		
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
