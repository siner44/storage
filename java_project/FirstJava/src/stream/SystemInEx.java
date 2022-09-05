package stream;

import java.io.InputStream;

public class SystemInEx {
	public static void main(String[] args) throws Exception {

		InputStream is = System.in;
		byte[] dates = new byte[30];

		System.out.print("이름 :");
		int nameBytes = is.read(dates);
		String name = new String(dates, 0, nameBytes - 2);

		System.out.println("입력한 이름 = " + name);
	}
}
