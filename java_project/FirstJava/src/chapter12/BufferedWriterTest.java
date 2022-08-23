package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("bufferedWriter.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("bufferedWriter");
			bw.newLine();
			bw.write("HI");
			bw.write(System.getProperty("line.separator") + "hello");
			
			bw.flush();
			
			System.out.println("파일 생성 및 내용 출력");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) try {fw.close();} catch(IOException e) {}
			if(bw != null) try {bw.close();} catch(IOException e) {}
		}
		
		
	}
}
