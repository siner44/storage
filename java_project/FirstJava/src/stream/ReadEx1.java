package stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readbyte;
		
		while(true) {
			readbyte=is.read();
			if(readbyte==-1) break;
			System.out.print((char) readbyte);
		}
		is.close();
	}
}
