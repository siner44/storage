package stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataInputOutput {
public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/x.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(3);
		
		dos.flush(); dos.close(); fos.close();
	}
}
