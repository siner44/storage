package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerialTest04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("userInfo.dat");
			ois = new ObjectInputStream(fis);

			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();

			System.out.println(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {}
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e) {}
		}

	}
}
