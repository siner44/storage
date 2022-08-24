package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialTest01 {
	public static void main(String[] args) {
		System.out.println("직렬화");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		Customer c = new Customer("박지성");

		try {
			fos = new FileOutputStream("object.dat");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(c);

			System.out.println("직렬화 성공");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {}
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {}
		}

	}
}
