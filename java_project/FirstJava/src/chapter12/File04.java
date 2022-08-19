package chapter12;

import java.io.File;

public class File04 {
	public static void main(String[] args) {
		String path = "sample.txt";
		String path2 = "example.txt";
		
		File f = new File(path);
		
		System.out.println("파일명 변경");
		
		File f2 = new File(path2);
		
		System.out.println(f.renameTo(f2));
		
	}
}
