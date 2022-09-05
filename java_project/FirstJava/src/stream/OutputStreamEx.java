package stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
	}
}
