package chapter12;

import java.io.File;

public class File05 {
	public static void main(String[] args) {
		String path = "example.txt";

		File f = new File(path);

		System.out.println("파일 삭제");

		if (f.delete()) {
			System.out.println(f.getName() + " 삭제");
		} else {
			System.out.println("삭제 불가");
		}

	}
}
