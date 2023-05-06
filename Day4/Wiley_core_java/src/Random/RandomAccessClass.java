package Random;

import java.io.RandomAccessFile;

public class RandomAccessClass {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("testfile.txt", "rw");
			file.writeBytes("Good day!");
			file.seek(0);
			byte[] bytes = new byte[13];
			file.read(bytes);
			String data = new String(bytes);
			System.out.println(data);
			file.seek(7);
			file.writeBytes("Java");
			
			file.seek(0);
			bytes = new byte[13];
			file.read(bytes);
			data = new String(bytes);
			System.out.println(data);
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
