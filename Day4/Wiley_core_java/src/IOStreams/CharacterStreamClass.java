package IOStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterStreamClass {
	public static void main(String[] args) throws IOException {
		Writer out = new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("D:\\Games\\Work\\WileyEdge\\Codes\\Day4\\Wiley_core_java\\data\\data5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Programmer");
		bw.flush();
		bw.close();
		fw.close();
		out.close();  
	}
}
