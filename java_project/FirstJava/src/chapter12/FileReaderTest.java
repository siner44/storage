package chapter12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("file.txt");
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) try {fr.close();} catch(IOException e) {}
		}
		
		
		
	}
}
