package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readbyte2;
		try {
			fis = new FileInputStream("file.txt");
			readbyte2 = new byte[fis.available()];
			fis.read(readbyte2);
			
			System.out.println(new String(readbyte2));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) try {fis.close();} catch(IOException e) {}
		}
	}
}
