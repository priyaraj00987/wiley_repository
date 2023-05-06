package IOStreams;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;

public class DataStreamClass {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\output.txt");
	    DataOutputStream dos = new DataOutputStream(fout);
	    
		dos.writeBytes("This is data streaming");
		dos.flush();
		dos.close();
		fout.flush();
		fout.close();
		
		FileInputStream fin = new FileInputStream("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\output.txt");
		DataInputStream din = new DataInputStream(fin);
		int count = fin.available();
		byte[] ba = new byte[count];
		din.read(ba);
		
		for(byte b: ba) {
			System.out.print((char) b);
		}
		din.close();
		fin.close();
	}
}
