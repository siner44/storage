package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fileout.txt", true);
			
			String message = "파일에 내용 출력";
			
			fos.write(message.getBytes());
			
			System.out.println("파일 생성 후 내용 출력");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) try {fos.close();} catch(IOException e) {}
		}
	}
}
