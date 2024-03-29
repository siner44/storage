package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialTest02 {
	public static void main(String[] args) {
		System.out.println("역직렬화");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("object.dat");
			ois = new ObjectInputStream(fis);
			
			Customer c = (Customer)ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fis != null) try {fis.close();} catch(IOException e) {}
			if(ois != null) try {ois.close();} catch(IOException e) {}
		}
	}
}
