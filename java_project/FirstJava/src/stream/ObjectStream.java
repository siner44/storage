package stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(new Integer(3));
		oos.writeObject(new String("안녕하세요"));
		oos.writeObject(new int[] { 1, 2, 3 });

		fos.close();
		oos.flush();
		oos.close();
	}
}
