package chapter12;

import java.io.File;
import java.io.IOException;

public class File03 {
	public static void main(String[] args) {
		
		String path = "sample.txt";
		
		File f1 = new File(path);
		System.out.println("파일 생성");
		
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 정보");
		System.out.println("절대 경로 : " + f1.getAbsolutePath());
		System.out.println("상대 경로 : " + f1.getPath());
		System.out.println("디렉토리명 : " + f1.getParent());
		System.out.println("파일명 : " + f1.getName());
		
	}
	
	
}
