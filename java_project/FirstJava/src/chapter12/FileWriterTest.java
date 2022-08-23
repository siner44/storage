package chapter12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("fileWriter.txt");
			
			String message = "fileWriter";
			
			fw.write(message);
			fw.flush();
			
			System.out.println("파일 생성 및 내용 입력");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
		
	}
}
