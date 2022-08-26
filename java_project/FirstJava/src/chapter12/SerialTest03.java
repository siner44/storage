package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialTest03 {
	public static void main(String[] args) {
		System.out.println("직렬화");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		UserInfo ui1 = new UserInfo("기영", 15, "서울");
		UserInfo ui2 = new UserInfo("기철", 15, "인천");
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(ui1);
		list.add(ui2);
		
		try {
			fos = new FileOutputStream("userInfo.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			System.out.println("객체 직렬화 성공");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) try {fos.close();} catch(IOException e) {}
			if(oos != null) try {oos.close();} catch(IOException e) {}
		}
	}
}
